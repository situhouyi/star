package com.star.diary.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient(name="star-admin",path = "user")
public interface UserService {

    @RequestMapping("/getUserInfo/{id}")
    String getUserInfo(@PathVariable("id") Long id);
}
