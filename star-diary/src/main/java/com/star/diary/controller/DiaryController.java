package com.star.diary.controller;

import com.alibaba.fastjson.JSON;
import com.star.diary.entity.User;
import com.star.diary.service.UserService;
import com.star.diary.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Api(value = "用户管理接口", tags = { "用户管理接口" }, hidden = true)
@RestController
@RequestMapping("/diary")
public class DiaryController {
//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @Autowired
    private RedisUtil redisUtil;

    @ApiOperation(value = "XXX接口描述")
    @GetMapping("/saveDiary")
    public String saveDiary(){
        redisUtil.set("username","王刚");
        User user = userService.selectUser("wanggang","root");//userService.getUserList();
        return "保存成功"+ JSON.toJSONString(user)+":"+redisUtil.get("username");
    }
}
