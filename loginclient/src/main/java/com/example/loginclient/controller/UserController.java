package com.example.loginclient.controller;

import com.example.loginclient.dao.UserMapper;
import com.example.loginclient.entity.User;
import com.example.loginclient.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public Map<String,Object> test(@RequestBody  User user){
        Map<String,Object> resMap = new HashMap<String,Object>();
        User res = userService.login(user);
        if(res != null){
            resMap.put("status","OK");
            resMap.put("content",res);
        }else{
            resMap.put("status","ERROR");
            resMap.put("content",null);
        }

        return resMap;
    }

    @RequestMapping(value = "/reg")
    public Map<String,Object> reg(@RequestBody  User user){
        Map<String,Object> resMap = new HashMap<String,Object>();
        Integer count = userService.reg(user);
        if(count != 1){
            resMap.put("status","ERROR");
            resMap.put("content",null);
        }else{
            resMap.put("status","OK");

        }

        return resMap;
    }



}
