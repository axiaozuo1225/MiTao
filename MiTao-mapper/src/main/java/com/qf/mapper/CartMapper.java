package com.qf.mapper;

import com.qf.entity.Cart;
import org.apache.ibatis.annotations.Select;

public interface CartMapper {

    @Select("select * from tb_cart ")
    Cart selectCart(String UserId);
}
