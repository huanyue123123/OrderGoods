package com.example.eurekafeign.service;

/*import com.example.eurekafeign.entity.User;
import com.example.eurekafeign.interfaces.DemoService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;*/

import com.example.eurekafeign.interfaces.DemoService;

/*@WebService(serviceName="DemoService",//对外发布的服务名
        targetNamespace="http://interfaces.eurekafeign.example.com",//指定你想要的名称空间，通常使用使用包名反转
        endpointInterface="com.example.eurekafeign.interfaces.DemoService")//服务接口全路径, 指定做SEI（Service EndPoint Interface）服务端点接口
@Service*/
public class DemoServiceImpl implements DemoService {

    /*private Map<String, User> userMap = new HashMap<String, User>();

    public DemoServiceImpl() {
        System.out.println("向实体类插入数据");
        User user = new User();

        user.setUserId(UUID.randomUUID().toString().replace("-", ""));
        user.setUsername("test1");
        user.setEmail("Jerry@163.xom");
        userMap.put(user.getUserId(), user);

        user = new User();
        user.setUserId(UUID.randomUUID().toString().replace("-", ""));
        user.setUsername("test2");
        user.setEmail("Jerryfix@163.xom");
        userMap.put(user.getUserId(), user);

        user = new User();
        user.setUserId(UUID.randomUUID().toString().replace("-", ""));
        user.setUsername("test3");
        user.setEmail("Jerryfix@163.xom");
        userMap.put(user.getUserId(), user);


    }

    @Override
    public User getUser(String userId) {
        System.out.println("userMap是:"+userMap);
        return userMap.get(userId);
    }

    @Override
    public String getUserName(String userId) {
        return "userId为：" + userId;
    }*/
}
