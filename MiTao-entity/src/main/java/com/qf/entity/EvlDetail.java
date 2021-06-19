package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 瀹炰綋绫伙細
 *
 * @author
 * @date 2021-06-10 17:35:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvlDetail implements Serializable {

    private Integer infoDetailId;
    private String infoDetailName;
    private String infoDetailDesc;
    //扣钱数
    private String goodDiscount;
}