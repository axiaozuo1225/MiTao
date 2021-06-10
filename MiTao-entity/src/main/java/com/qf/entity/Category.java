package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 瀹炰綋绫伙細
 *
 * @author
 * @date 2021-06-10 17:32:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable {

    private Integer categoryId;
    private String categoryName;
}