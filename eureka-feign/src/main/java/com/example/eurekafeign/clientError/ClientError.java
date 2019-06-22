package com.example.eurekafeign.clientError;

import com.example.eurekafeign.interfaces.ServiceHi;
import org.springframework.stereotype.Component;

@Component
public class ClientError implements ServiceHi {


    @Override
    public String sayHiClient(String name) {
        return "hiClient出错了";
    }
}
