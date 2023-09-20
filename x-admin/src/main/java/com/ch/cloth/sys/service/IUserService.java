package com.ch.cloth.sys.service;

import com.ch.cloth.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;


public interface IUserService extends IService<User> {

    Map<String, Object> login(User user);

    Map<String, Object> getUserInfo(String token);

    void logout(String token);

    void addUser(User user);

    User getUserById(Integer id);

    void updateUser(User user);

    void deleteUserById(Integer id);
}
