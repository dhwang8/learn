package com.dream.learn.init;

import com.dream.learn.dao.LearnDao;
import com.dream.learn.dto.TOrderInfo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class InsertTask {

    private static final Logger logger = LoggerFactory.getLogger(InsertTask.class);

    private static final String EXCEL_PATH = "C:\\Users\\ASUS\\Desktop\\新平台导入老平台订单.xlsx";

    @Autowired
    private LearnDao learnDao;

    /**
     * 项目启动执行1次
     */
    @PostConstruct
    public void workBookTask() {
        logger.info("【解析Excel】任务开始执行");
        try {
            workBookTaskData();
        } catch (Exception e) {
            logger.error("【解析Excel】任务开始报错", e);
        }
        logger.info("【解析Excel】任务执行结束");
    }


    private void workBookTaskData() {
        try {
            File excel = new File(EXCEL_PATH);
            if (excel.isFile() && excel.exists()) {   //判断文件是否存在
                String[] split = excel.getName().split("\\.");  //.是特殊字符，需要转义！！！！！
                Workbook wb;
                //根据文件后缀（xls/xlsx）进行判断
                if ("xls".equals(split[1])) {
                    FileInputStream fis = new FileInputStream(excel);   //文件流对象
                    wb = new HSSFWorkbook(fis);
                } else if ("xlsx".equals(split[1])) {
                    wb = new XSSFWorkbook(excel);
                } else {
                    System.out.println("文件类型错误!");
                    return;
                }
                //开始解析
                Sheet sheet = wb.getSheetAt(0);     //读取sheet 0
                int firstRowIndex = sheet.getFirstRowNum() + 1;   //第一行是列名，所以不读
                int lastRowIndex = sheet.getLastRowNum();
                System.out.println("总行数：lastRowIndex: " + lastRowIndex);

                List<TOrderInfo> tOrderInfos = new ArrayList<>();
                for (int rIndex = firstRowIndex; rIndex <= lastRowIndex; rIndex++) {   //遍历行
                    System.out.println("rIndex: " + rIndex);
                    Row row = sheet.getRow(rIndex);
                    TOrderInfo tOrderInfo = new TOrderInfo();
                    if (row != null) {
                        tOrderInfo.setId(rIndex + "");
                        tOrderInfo.setAppkey(rIndex + "");
                        tOrderInfo.setOutOrderId(row.getCell(2).toString());
                    }
                    tOrderInfos.add(tOrderInfo);
                    if (tOrderInfos.size() >= 100) {
                        //入表
                        learnDao.saveOrders(tOrderInfos);
                        tOrderInfos.clear();
                    }
                }
                //入表
                learnDao.saveOrders(tOrderInfos);
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
