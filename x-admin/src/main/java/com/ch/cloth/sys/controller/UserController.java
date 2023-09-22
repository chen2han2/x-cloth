package com.ch.cloth.sys.controller;

import com.ch.cloth.common.vo.Result;
import com.ch.cloth.sys.entity.User;
import com.ch.cloth.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
// @CrossOrigin   跨域处理
public class UserController {
    @Autowired
    private IUserService userService;



    @GetMapping("/all")
    public Result<List<User>> getAllUser(){
        List<User> list = userService.list();
        userService.getUserById(1);
        //System.out.println("++++++users:" + user.size());
        return Result.success(list,"查询成功");
    }


}
