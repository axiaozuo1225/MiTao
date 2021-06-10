package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 瀹炰綋绫伙細
 *
 * @author
 * @date 2021-06-10 17:37:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Systemparam implements Serializable {

    private Integer systemparamId;
    private String systemparamName;
    private String systemparamValue;
}