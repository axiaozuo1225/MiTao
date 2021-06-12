package com.qf.mapper;

import com.qf.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsMapper {
    List<Goods> selectByPageAndWhere(@Param("categoryId") String categoryId, @Param("goodsBrandId") String goodsBrandId);

    @Select("select * from tb_goods where goods_id = #{goodsId}")
    Goods selectGoodsInfo(String goodsId);
}
