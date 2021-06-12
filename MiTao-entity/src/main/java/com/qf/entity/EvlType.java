package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 瀹炰綋绫伙細
 *
 * @author
 * @date 2021-06-12 21:06:41
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvlType implements Serializable {

    private Integer evlTypeId;
    private String evlTypeName;

    private List<EvlBasic> evlBasicList;
}