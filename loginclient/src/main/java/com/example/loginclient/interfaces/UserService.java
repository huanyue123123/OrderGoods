package com.example.loginclient.interfaces;

import com.example.loginclient.entity.User;

public interface UserService {

    User login(User user);

    User register(User user);

    Integer reg(User user);


}
