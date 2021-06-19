package com.qf.mapper;

import com.qf.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from tb_user where user_name = #{userName} and user_password = #{userPassword}")
    User checkUser(User user);

    @Select("select * from tb_user where user_id = #{userId}")
    User selectUser(String userId);
}
