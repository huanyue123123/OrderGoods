package com.example.loginclient.dao;


import com.example.loginclient.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selectTest();

    User selectTrueUser(User user);

    Integer insertOneUser(User user);
}
