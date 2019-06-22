package com.example.eurekafeign.interfaces;

import com.example.eurekafeign.clientError.LoginClientError;
import com.example.eurekafeign.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;
import java.util.Map;

@FeignClient(value = "LOGINCLIENT",fallback = LoginClientError.class)
public interface LoginClient {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    Map<String,Object> login(@RequestBody User user);

    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    Map<String,Object> reg(@RequestBody User user);

}
