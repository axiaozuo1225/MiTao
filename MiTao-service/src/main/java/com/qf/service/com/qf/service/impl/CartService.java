package com.qf.service.com.qf.service.impl;

import com.qf.entity.Cart;
import com.qf.mapper.CartMapper;
import com.qf.service.com.qf.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService implements ICartService {

    @Autowired
    private CartMapper cartMapper;

    @Override
    public Cart showCart(String UserId){
        cartMapper
    }

}
