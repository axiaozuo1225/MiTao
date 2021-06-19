package com.qf.controller;

import com.qf.entity.User;
import com.qf.service.com.qf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("html/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    @ResponseBody
    public User checkUser (@RequestBody User user){

        return userService.checkUser(user);
//        System.out.println(user1);

    }

    @RequestMapping("findUser")
    @ResponseBody
    public User findUserById (@RequestBody String userId){
        return userService.findUserById(userId);
    }

}
