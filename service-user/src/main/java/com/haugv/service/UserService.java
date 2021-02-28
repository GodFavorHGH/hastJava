package com.haugv.service;

import com.haugv.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {

    int createUser(User user);

    User getUser(int id);

    User doLogin(String name, String password);
}
