package com.qf.mapper;

import com.qf.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from tb_user where user_name = #{userName} and user_password = #{userPassword}")
    User checkUserByUP(User user);

    @Select("select * from tb_user where user_id = #{userId}")
    User selectUser(String userId);

    @Select("select * from tb_user where user_phone = #{userPhone}")
    User selectUserByPhone(String userPhone);

}
