package com.dream.learn.controller;

import com.dream.learn.dto.LearnUserDto;
import com.dream.learn.service.LearnServiceImpl;
import com.dream.learn.utils.ApiResult;
import com.dream.learn.utils.PageHelp;
import com.dream.learn.utils.ResultCode;
import com.github.pagehelper.PageInfo;
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

    /**
     * 普通查询
     * @return 1
     */
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

    /**
     * 分页查询：自己分页
     * @param learnUser ：学生对象
     * @return ： 1
     */
    @RequestMapping(value = "/getUserPage")
    public ApiResult getUserPage(LearnUserDto learnUser){
        logger.info("开始查询分页学生对象");
        //当前页数
        Integer pageNum = learnUser.getPageNum();
        //每页条数
        Integer limit = learnUser.getLimit();
        //本次查询开始
        Integer begin = limit * (pageNum - 1);
        //本次查询结束
        Integer end = pageNum * limit;
        PageHelp pageHelp;
        try {
            pageHelp = learnService.getUserPage(begin, end);
        } catch (Exception e){
            logger.error("查询学生对象失败", e);
            return ApiResult.failure(ResultCode.FAIL);
        }
        return ApiResult.success(pageHelp);
    }


    /**
     * 分页查询2：pageHelper插件分页
     * @param learnUser ：学生对象
     * @return ： 1
     */
    @RequestMapping(value = "/getPageHelp")
    public ApiResult getUserPage2(LearnUserDto learnUser){
        logger.info("开始查询分页学生对象");
        //当前页数
        Integer pageNum = learnUser.getPageNum();
        //每页条数
        Integer limit = learnUser.getLimit();
        PageInfo pageInfo;
        try {
            pageInfo = learnService.getUserPage2(pageNum, limit);
        } catch (Exception e){
            logger.error("查询学生对象失败", e);
            return ApiResult.failure(ResultCode.FAIL);
        }
        return ApiResult.success(pageInfo);
    }

}
