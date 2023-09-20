package com.ch.cloth.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.ch.cloth.sys.entity.User;

import com.ch.cloth.sys.mapper.UserMapper;

import com.ch.cloth.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *

 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Override
    public Map<String, Object> login(User user) {
        return null;
    }

    @Override
    public Map<String, Object> getUserInfo(String token) {
        return null;
    }

    @Override
    public void logout(String token) {

    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public User getUserById(Integer id) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUserById(Integer id) {

    }
}







