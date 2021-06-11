package com.qf.mapper;

import com.qf.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    List<Goods> selectByPageAndWhere(@Param("categoryId") String categoryId, @Param("goodsBrandId") String goodsBrandId);
}
