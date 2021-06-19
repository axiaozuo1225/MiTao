package com.qf.controller;

import com.qf.entity.BuyBackOrder;
import com.qf.entity.OrderDTO;
import com.qf.service.com.qf.service.IOrderService;
import com.qf.entity.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("html/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @RequestMapping("addOrder/{DetailIds}")
    @ResponseBody
    public ResultVO addOrder(@RequestBody BuyBackOrder buyBackOrder, @PathVariable String[] DetailIds) {

        int i = orderService.addOrder(buyBackOrder, DetailIds);

        if (i > 0) {
            return ResultVO.success("提交回购单成功!");
        } else {
            return ResultVO.fail("提交失败!");
        }
    }

    @RequestMapping("showOrder")
    @ResponseBody
    public List<BuyBackOrder> showOrder (@RequestBody String userId){
//        System.out.println(userId);
        List<BuyBackOrder> buyBackOrder = orderService.showOrder(userId);
//        System.out.println(buyBackOrder);
        return buyBackOrder;
    }

    @RequestMapping("showOrderDetail")
    @ResponseBody
    public BuyBackOrder showOrderDetail (@RequestBody String orderId){
//        System.out.println(userId);
        BuyBackOrder buyBackOrder = orderService.showOrderDetail(orderId);
//        System.out.println(buyBackOrder);
        return buyBackOrder;
    }
}

