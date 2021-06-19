package com.qf.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 瀹炰綋绫伙細评论表
 *
 * @author
 * @date 2021-06-19 08:52:56
 */
@Data
public class Comments implements Serializable {
    /**
     *
     */
    private Integer comId;
    /**
     *
     */
    private Integer comUserId;

    private User comUser;
    /**
     *
     */
    private Integer comGoodsId;
    /**
     *
     */
    private String comContent;

    private Date comTime;
}