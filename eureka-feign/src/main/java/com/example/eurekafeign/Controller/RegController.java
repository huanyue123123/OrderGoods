package com.example.eurekafeign.Controller;

import com.example.eurekafeign.entity.User;
import com.example.eurekafeign.interfaces.LoginClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class RegController {

    @Autowired
    private LoginClient loginClient;

    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    public Map<String,Object> login(@RequestBody User user){

        return loginClient.reg(user);
    }



}
