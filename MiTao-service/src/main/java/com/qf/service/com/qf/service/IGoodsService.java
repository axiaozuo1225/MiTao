package com.qf.service.com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.entity.Goods;

import java.util.List;

public interface IGoodsService {

    PageInfo<Goods> showByPageAndWhere (String categoryId, String brandId, String curPage);

    Goods showGoodsInfo (String goodsId);

}
