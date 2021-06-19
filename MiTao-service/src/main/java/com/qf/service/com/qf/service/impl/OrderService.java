package com.qf.service.com.qf.service.impl;


import com.qf.entity.BuyBackOrder;
import com.qf.entity.OrderDTO;
import com.qf.mapper.OrderMapper;
import com.qf.service.com.qf.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Transactional
    public int addOrder(BuyBackOrder buyBackOrder, String[] detailIds) {

        int boId = orderMapper.insertOrder(buyBackOrder);

        int i = orderMapper.insertOrderDetail(buyBackOrder, detailIds);

        return boId > 0 && i > 0 ? 1 : 0;
    }

    @Override
    public List<BuyBackOrder> showOrder(String userId){
        List<BuyBackOrder> buyBackOrder = orderMapper.selectOrder(userId);
        return buyBackOrder;
    }

    @Override
    public BuyBackOrder showOrderDetail(String orderId) {

        BuyBackOrder buyBackOrder = orderMapper.selectOrderDetail(orderId);
//        System.out.println(buyBackOrder);

        return buyBackOrder;
    }


}
