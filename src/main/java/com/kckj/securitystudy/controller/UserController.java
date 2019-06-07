package com.kckj.securitystudy.controller;

import com.kckj.securitystudy.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(){
        return new User(1,"张三","123456");
    }
}
