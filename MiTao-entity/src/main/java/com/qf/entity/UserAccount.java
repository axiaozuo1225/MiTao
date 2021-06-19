package com.qf.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 瀹炰綋绫伙細用户账户表
 *
 * @author
 * @date 2021-06-17 11:03:22
 */
@Data
public class UserAccount implements Serializable {
    /**
     * 账户id
     */
    private Integer accId;
    /**
     * 0:微信账号
     * 1：支付宝账号
     * 2：银联账号
     */
    private Integer accType;
    /**
     * 真实姓名
     */
    private String accName;
    /**
     * 账户信息
     */
    private String accNumber;
}