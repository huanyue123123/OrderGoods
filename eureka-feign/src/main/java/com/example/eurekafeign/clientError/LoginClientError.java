package com.example.eurekafeign.clientError;

import com.example.eurekafeign.entity.User;
import com.example.eurekafeign.interfaces.LoginClient;

import java.util.HashMap;
import java.util.Map;

public class LoginClientError implements LoginClient {
    @Override
    public Map<String, Object> login(User user) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status","WARNING");
        map.put("content","loginclient登录服务异常");
        return map;
    }

    @Override
    public Map<String, Object> reg(User user) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status","WARNING");
        map.put("content","loginclient登录服务异常");
        return map;
    }
}
