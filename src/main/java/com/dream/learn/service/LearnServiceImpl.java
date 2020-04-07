package com.dream.learn.service;

import com.dream.learn.dao.LearnDao;
import com.dream.learn.dto.LearnUserDto;
import com.dream.learn.dto.SchoolDto;
import com.dream.learn.utils.ApiResult;
import com.dream.learn.utils.PageHelp;
import com.dream.learn.utils.ResultCode;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LearnServiceImpl {

    private static final Logger logger = LoggerFactory.getLogger(LearnServiceImpl.class);

    @Autowired
    private LearnDao learnDao;

    public List<LearnUserDto> getLearnUsers(){
        return learnDao.getLearnUsers();
    }

    public PageHelp getUserPage(Integer begin, Integer end){
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("begin", begin);
        hashMap.put("end", end);
        //TODO:查询总数

        return PageHelp.setRows1(learnDao.getUserPage(hashMap), 0);
    }

    public PageInfo getUserPage2(Integer pageNum, Integer limit){
        PageHelper.startPage(pageNum,10);
        List<LearnUserDto> list = learnDao.getLearnUsers();
        return new PageInfo<LearnUserDto>(list);
    }


    /**
     * 自动回滚
     * @return
     */
    @Transactional(rollbackFor = { Exception.class })
    public ApiResult add2() {

        LearnUserDto learnUserDto = new LearnUserDto("xiaoming", "dddd", "wwww", "kkkkk");
        SchoolDto schoolDto = new SchoolDto("ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss", "ddd");
        learnDao.addUser(learnUserDto);
        learnDao.addSchool(schoolDto);
        return ApiResult.success();
    }


    /**
     * 手动回滚，catch里面需要做别的事
     * @return
     */
    @Transactional(rollbackFor = { Exception.class })
    public ApiResult add1() {
        try {
            LearnUserDto learnUserDto = new LearnUserDto("xiaoming", "dddd", "wwww", "kkkkk");
            SchoolDto schoolDto = new SchoolDto("ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss", "ddd");
            learnDao.addUser(learnUserDto);
            learnDao.addSchool(schoolDto);
        } catch (Exception e) {
            logger.error("入表报错", e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ApiResult.failure(ResultCode.FAIL);
        }
        return ApiResult.success();
    }


    public void do1(){
        System.out.println(Thread.currentThread().getName());
        logger.info("1:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    @Async("taskExecutor")
    public void do2(){
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        logger.info("2:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    public void do3(){
        System.out.println(Thread.currentThread().getName());
        logger.info("3:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }


}
