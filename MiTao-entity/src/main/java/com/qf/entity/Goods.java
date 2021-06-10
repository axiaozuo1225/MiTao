package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 瀹炰綋绫伙細
 *
 * @author
 * @date 2021-06-10 17:35:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods implements Serializable {

    private Integer goodsId;
    private String goodsName;
    private String goodsImg;
    private Integer goodsCost;
    private Integer goodsBrandId;
    private Integer goodsMinPrice;
    private Integer goodsFirstPrice;
    private Integer goodsSecondPrice;
    private Integer goodsThirdPrice;
    private Integer goodsForthPrice;
    private Integer goodsFifthPrice;
}