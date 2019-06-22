package com.example.serviceribbon.Controller;

import com.example.serviceribbon.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/haha")
    public String Hello(@RequestParam(value = "name", defaultValue = "forezp") String name){

        return helloService.hiService(name);

    }



}
