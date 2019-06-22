package com.example.eurekafeign.interfaces;

import com.example.eurekafeign.clientError.ClientError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "EUREKACLIENT",fallback = ClientError.class)
public interface ServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiClient(@RequestParam(value = "name") String name);



}
