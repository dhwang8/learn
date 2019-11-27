package com.dream.learn.service;

import com.dream.learn.dao.LearnDao;
import com.dream.learn.dto.LearnUserDto;
import com.dream.learn.utils.PageHelp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LearnServiceImpl {

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
}
