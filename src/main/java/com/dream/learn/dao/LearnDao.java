package com.dream.learn.dao;

import com.dream.learn.dto.LearnUserDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LearnDao {

    List<LearnUserDto> getLearnUsers();
}
