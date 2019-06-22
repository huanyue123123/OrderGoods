package com.example.eurekafeign.Controller;

import com.example.eurekafeign.entity.User;
import com.example.eurekafeign.interfaces.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {

    @Autowired
    private ServiceHi serviceHi;

    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name") String name){

        return serviceHi.sayHiClient(name);
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    @RequestMapping("/welcome")
    public ModelAndView welcome(){
        return new ModelAndView("pages/welcome");
    }


    @CrossOrigin
    @RequestMapping("/UserToString")
    public String crossOrign(User user){
        return user.toString();
    }


}
