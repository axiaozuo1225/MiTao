package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * 瀹炰綋绫伙細回购单
 *
 * @author
 * @date 2021-06-17 11:02:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuyBackOrder implements Serializable {
    /**
     *
     */
    private Integer boId;
    /**
     * 商品id
     */
    private Integer boGoodsId;
    /**
     * 商品名称
     */
    private String boGoodsName;
    /**
     * 回购价格
     */
    private Integer boPrice;
    /**
     * 0:未完成
     * 1：已完成
     */
    private Integer boStatus;
    /**
     * 联系人地址
     */
    private Integer boAddress;

    private Address address;

    private Integer boUserId;
    /**
     *
     */
    private Date boCreatetime;

    private Integer boAccountId;

    private List<EvlDetail> evlDetailList;

}