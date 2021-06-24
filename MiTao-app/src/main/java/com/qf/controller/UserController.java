package com.qf.controller;

import cn.hutool.core.util.StrUtil;
import com.qf.entity.ResultVO;
import com.qf.entity.User;
import com.qf.service.com.qf.service.ISMSService;
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

    @Autowired
    private ISMSService smsService;

    @RequestMapping("login")
    @ResponseBody
    public ResultVO login(User loginUser) {
        if (!StrUtil.isEmpty(loginUser.getUserName())) {
            User user = userService.checkUser(loginUser);
            if (user == null) {
                return ResultVO.fail("用户名或密码错误!");
            } else {
                return ResultVO.success("登录成功", user);
            }
        } else {
//            登录验证redis验证码
            return userService.checkUserByCode(loginUser);
        }
    }

    @RequestMapping("sendSMS")
    @ResponseBody
    public ResultVO sendSMS(String userPhone) {
        return smsService.sendSMS(userPhone);
    }

    @RequestMapping("findUser")
    @ResponseBody
    public User findUserById(@RequestBody String userId) {
        return userService.findUserById(userId);
    }


}
