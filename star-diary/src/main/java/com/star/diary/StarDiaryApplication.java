package com.star.diary;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@MapperScan(basePackages = "com.star.diary.mapper")
public class StarDiaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarDiaryApplication.class, args);
    }

}
