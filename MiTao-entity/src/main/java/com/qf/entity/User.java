package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 瀹炰綋绫伙細
 *
 * @author
 * @date 2021-06-10 17:38:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private Integer userId;
    private String userName;
    private String userPassword;
    private String userSalt;
    private String userPhone;
    private String userImg;
    private String code;
}