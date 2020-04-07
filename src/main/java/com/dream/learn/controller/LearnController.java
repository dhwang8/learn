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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
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
    @ResponseBody
    public Object getLearnUsers(){
        logger.info("开始查询学生对象");
        List<LearnUserDto> learnUserDtos = new ArrayList<>();
        try {
            learnUserDtos = learnService.getLearnUsers();
        } catch (Exception e){
            logger.error("查询学生对象失败", e);
            return ApiResult.failure(ResultCode.FAIL);
        }

        return learnUserDtos;
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

    /**
     * 新增
     */
    @RequestMapping(value = "/add1")
    @ResponseBody
    public ApiResult add1(){
        return learnService.add1();
    }

    /**
     * 新增
     */
    @RequestMapping(value = "/add2")
    @ResponseBody
    public ApiResult add2(){
        return learnService.add2();
    }

    /**
     * 异步调用测试 https://blog.csdn.net/YoungLee16/article/details/88398045
     * @Async 基于Aop动态代理，要用代理类来调
     */
    @RequestMapping(value = "/getAsync")
    @ResponseBody
    public void getAsync(){
        learnService.do1();
        learnService.do2();
        learnService.do3();;
    }

}
