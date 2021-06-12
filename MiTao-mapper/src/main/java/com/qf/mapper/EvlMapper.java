package com.qf.mapper;

import com.qf.entity.EvlType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EvlMapper {

    List<EvlType> selectEvlType(@Param("goodsId") String goodsId);

}
