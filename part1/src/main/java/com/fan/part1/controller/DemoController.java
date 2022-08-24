package com.fan.part1.controller;

import com.fan.part1.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Value("${url.orderurl}")
    private String orderurl;

    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot";
    }

    @RequestMapping("/user")
    public User getUser(){
        return new User(1,"w","123");
    }

    @RequestMapping("/userList")
    public List<User> userList(){
        User user1 = new User(1,"a","123");
        User user2 = new User(2,"b", null);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        return users;
    }

    @RequestMapping("/ymlpro")
    public String testYmlProperty(){
        logger.info("yml配置文件中的orderurl的值是{}", orderurl );
        return "success";
    }


    public User testYmlPropertiesToUser(){
        return new User();
    }
}
