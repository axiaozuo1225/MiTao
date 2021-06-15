package com.qf.mapper;

import com.qf.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from tb_user where user_name = #{username} and user_password = #{password}")
    User checkUser(User user);
}
