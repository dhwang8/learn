package com.dream.learn.dao;

import com.dream.learn.dto.LearnUserDto;
import com.dream.learn.dto.SchoolDto;
import com.dream.learn.dto.TOrderInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface LearnDao {

    List<LearnUserDto> getLearnUsers();

    List<LearnUserDto> getUserPage(Map<String, Integer> hashMap);

    void saveOrders(List<TOrderInfo> tOrderInfos);

    void addUser(LearnUserDto learnUserDto);

    void addSchool(SchoolDto schoolDto);

}
