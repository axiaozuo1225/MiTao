package com.qf.service.com.qf.service;

import cn.hutool.db.sql.Order;
import com.qf.entity.BuyBackOrder;
import com.qf.entity.OrderDTO;

import java.util.List;

public interface IOrderService {

    int addOrder(BuyBackOrder buyBackOrder, String[] detailIds);

    List<BuyBackOrder> showOrder(String userId);

    BuyBackOrder showOrderDetail(String orderId);
}
