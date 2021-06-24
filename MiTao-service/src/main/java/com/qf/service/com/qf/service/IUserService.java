package com.qf.service.com.qf.service;

import com.qf.entity.ResultVO;
import com.qf.entity.User;

public interface IUserService {

    User checkUser(User user);

    User findUserById(String userId);

    User findUserByPhone(String userPhone);

    ResultVO checkUserByCode(User user);
}
