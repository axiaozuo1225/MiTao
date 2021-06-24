package com.qf.service.com.qf.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.qf.entity.ResultVO;
import com.qf.entity.User;
import com.qf.mapper.UserMapper;
import com.qf.service.com.qf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public User checkUser(User user) {
        user.setUserPassword(SecureUtil.md5(user.getUserPassword()));
        return userMapper.checkUserByUP(user);
    }

    @Override
    public User findUserById(String userId) {
        return userMapper.selectUser(userId);
    }

    @Override
    public User findUserByPhone(String userPhone) {
        return userMapper.selectUserByPhone(userPhone);
    }

    @Override
    public ResultVO checkUserByCode(User loginUser) {

        String userPhone = loginUser.getUserPhone();

        if (StrUtil.isEmpty(userPhone)) {
            return ResultVO.fail("手机号不能为空!");
        }
        String code = redisTemplate.boundValueOps("SMS:" + userPhone).get();

        if (!loginUser.getCode().equals(code)) {
            return ResultVO.fail("验证码错误!");
        }

        User user = userMapper.selectUserByPhone(userPhone);

        if (user == null) {
            redisTemplate.delete("SMS:" + userPhone);
            return ResultVO.fail("用户不存在!");
        } else {
            redisTemplate.delete("SMS:" + userPhone);
            return ResultVO.success("成功登录",user);
        }
    }
}
