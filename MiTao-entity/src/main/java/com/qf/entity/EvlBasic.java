package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 瀹炰綋绫伙細
 *
 * @author
 * @date 2021-06-10 17:34:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvlBasic implements Serializable {

    private Integer basicInfoId;
    private String basicInfoName;
    private String basicType;
}