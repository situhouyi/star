package com.star.diary.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.star.diary.entity.User;
import com.star.diary.mapper.UserMapper;
import com.star.diary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserList() {
        return userMapper.selectById(1);
    }

    public User selectUser(String name,String password){
//        User user = new User();
//        user.setUserName("lisi");
//        user.setPassword("root");
//        userMapper.insert(user);

        IPage<User> userPage = new Page<>(1, 2);//参数一是当前页，参数二是每页个数
        userPage = userMapper.selectPage(userPage, null);
        List<User> list = userPage.getRecords();
        for(User user : list){
            System.out.println(JSON.toJSONString(user));
        }


        return userMapper.selectUser(name,password);
    }
}
