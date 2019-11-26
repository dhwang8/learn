package com.dream.learn.controller;

import com.dream.learn.dto.LearnUserDto;
import com.dream.learn.service.LearnServiceImpl;
import com.dream.learn.utils.ApiResult;
import com.dream.learn.utils.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class LearnController {

    private static final Logger logger = LoggerFactory.getLogger(LearnController.class);

    @Autowired
    private LearnServiceImpl learnService;

    @RequestMapping(value = "/getLearnUsers", method = RequestMethod.GET)
    public ApiResult getLearnUsers(){
        logger.info("开始查询学生对象");
        List<LearnUserDto> learnUserDtos;
        try {
            learnUserDtos = learnService.getLearnUsers();
        } catch (Exception e){
            logger.error("查询学生对象失败", e);
            return ApiResult.failure(ResultCode.FAIL);
        }
        return ApiResult.success(learnUserDtos);
    }

//    @RequestMapping(value = "/getUserPage")
//    public ApiResult getUserPage(LearnUserDto learnUser){
//        List<LearnUserDto> learnUserDtos;
//        try {
//            learnUserDtos = learnService.getLearnUsers();
//        } catch (Exception e){
//            logger.error("查询学生对象失败", e);
//            return ApiResult.failure(ResultCode.FAIL);
//        }
//        return ApiResult.success(learnUserDtos);
//    }

}
