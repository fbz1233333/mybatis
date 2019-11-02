package com.example.mybaits.controller;

import com.example.mybaits.entity.User;
import com.example.mybaits.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/{id}")
    public User getById(@PathVariable String id){
        return userMapper.selectByPrimaryKey(id);
    }
}
