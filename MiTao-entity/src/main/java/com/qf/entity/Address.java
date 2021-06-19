package com.qf.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 瀹炰綋绫伙細联系地址表
 *
 * @author
 * @date 2021-06-17 10:55:55
 */
@Data
public class Address implements Serializable {
    /**
     *
     */
    private Integer adrId;
    /**
     * 联系人姓名
     */
    private String adrName;
    /**
     * 联系电话
     */
    private String adrPhone;
    /**
     * 省
     */
    private String adrProvince;
    /**
     * 市
     */
    private String adrCity;
    /**
     * 区
     */
    private String adrZone;
    /**
     * 详细地址
     */
    private String adrDetail;

    private String adrUserId;
    /**
     * 0:默认地址
     1：非默认地址
     */
    private Integer defaultStatus;
}