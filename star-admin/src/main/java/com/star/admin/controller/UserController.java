package com.star.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${username1}")
    private String username;

    @RequestMapping("/getUserInfo/{id}")
    public String getUserInfo(@PathVariable("id") Long id){
        return "哈哈哈哈"+username;
    }

}
