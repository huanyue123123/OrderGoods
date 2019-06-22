package com.example.loginclient.controller;

import com.example.loginclient.dao.UserMapper;
import com.example.loginclient.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/test")
    public String test(){
        List<User> users = userMapper.selectTest();
        StringBuffer stringBuffer  = new StringBuffer("");
        for (User user:users) {
            stringBuffer.append("["+user+"]");
        }
        return stringBuffer.toString();
    }

}
