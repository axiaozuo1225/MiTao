package com.qf.mapper;

import com.qf.entity.BuyBackOrder;
import com.qf.entity.OrderDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

    int insertOrder(BuyBackOrder buyBackOrder);

    int insertOrderDetail(@Param("buyBackOrder") BuyBackOrder buyBackOrder, @Param("detailIds") String[] detailIds);

    List<BuyBackOrder> selectOrder(String userId);

    BuyBackOrder selectOrderDetail(String orderId);

}
