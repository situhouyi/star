package com.star.diary.service;

import com.star.diary.entity.User;

import java.util.List;

public interface UserService {

    User getUserList();

    User selectUser(String name,String password);

}
