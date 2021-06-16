package com.qf.service.com.qf.service.impl;

import cn.hutool.crypto.SecureUtil;
import com.qf.entity.User;
import com.qf.mapper.UserMapper;
import com.qf.service.com.qf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkUser(User user) {
        String userPassword = user.getUserPassword();

        user.setUserPassword(SecureUtil.md5(userPassword));
        return userMapper.checkUser(user);
    }
}
