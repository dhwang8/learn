package com.dream.learn;
/**
 * 1.返回数据格式
 * 2.分页查询 + pageHelp分页查询,批量插入
 * 3.表格数据解析入库
 * 4.极光推送
 * 5.手动回滚
 *
 *
 *
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = "com.**.dao")
public class LearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnApplication.class, args);
    }

}
