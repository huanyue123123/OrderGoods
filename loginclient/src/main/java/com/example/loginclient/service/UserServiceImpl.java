package com.example.loginclient.service;

import com.example.loginclient.dao.UserMapper;
import com.example.loginclient.entity.User;
import com.example.loginclient.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.selectTrueUser(user);
    }

    @Override
    public User register(User user) {
        return null;
    }

    @Override
    public Integer reg(User user) {
        return userMapper.insertOneUser(user);
    }
}
