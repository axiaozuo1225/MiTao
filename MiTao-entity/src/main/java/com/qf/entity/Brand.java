package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author
 * @date 2021-06-10 17:26:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Brand implements Serializable {

    private Integer brandId;
    private String brandName;
}