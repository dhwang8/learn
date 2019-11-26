package com.dream.learn.service;

import com.dream.learn.dao.LearnDao;
import com.dream.learn.dto.LearnUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearnServiceImpl {

    @Autowired
    private LearnDao learnDao;

    public List<LearnUserDto> getLearnUsers(){
        return learnDao.getLearnUsers();
    }
}
