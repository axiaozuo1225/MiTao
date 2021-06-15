package com.qf.mapper;

import com.qf.entity.Cart;
import org.apache.ibatis.annotations.Select;

public interface CartMapper {

    Cart selectCart(String UserId);
}
