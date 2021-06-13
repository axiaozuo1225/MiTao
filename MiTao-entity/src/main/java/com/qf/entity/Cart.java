package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author
 * @date 2021-06-10 17:31:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart implements Serializable {

    private Integer cartId;
//    private Integer fkCartUserId;
//    private Integer fkCartGoodId;
    private Integer cartGoodPrice;

    private List<Goods> goodsList;
}