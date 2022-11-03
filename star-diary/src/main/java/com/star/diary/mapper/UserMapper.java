package com.star.diary.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.star.diary.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {

    User selectUser(@Param("userName") String name, @Param("password") String password);
}
