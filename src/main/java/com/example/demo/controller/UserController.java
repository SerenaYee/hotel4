package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 叶佳
 */

@Controller
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/hotel")
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/find")//映射login
    public String userFind()
    {
        int userId=userMapper.selectUserIdByName("yj");//通过userMapper来获取
        System.out.println("====================");
        System.out.println(userId);
        return "hello";
    }
}