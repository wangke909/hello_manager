package com.wangke.web.controller;

import com.wangke.pojo.User;
import com.wangke.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public String addUser(User user){
        this.userService.addUser(user);
        return "ok";
    }
}
