package com.qf.service.com.qf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.entity.Comments;
import com.qf.entity.Goods;
import com.qf.entity.User;
import com.qf.mapper.GoodsMapper;
import com.qf.service.com.qf.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;

@Service
public class GoodsService implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public PageInfo<Goods> showByPageAndWhere(String categoryId, String brandId, String curPage) {


//        System.out.println(brandId);
//        System.out.println(brandId == null);

        PageHelper.startPage(Integer.parseInt(curPage),3);
        List<Goods> goods = goodsMapper.selectByPageAndWhere(categoryId,brandId);
//        System.out.println(goods);
        PageInfo<Goods> pageInfo = new PageInfo<>(goods);

//        System.out.println(pageInfo.getPageNum());
//        System.out.println(pageInfo.getPages());
//        System.out.println(goods);

        return pageInfo;
    }

    @Override
    public Goods showGoodsInfo (String goodsId){
        Goods goods = goodsMapper.selectGoodsInfo(goodsId);
//        System.out.println(goods);
        return goods;
    }

    @Override
    public int addComments(Comments comments) {
        return goodsMapper.insertComments(comments);
    }

    @Override
    public List<Comments> showComments(String goodsId) {
        List<Comments> comments = goodsMapper.selectComments(goodsId);

        comments.forEach(comments1 -> {
            User comUser = comments1.getComUser();
            comUser.setUserPhone(comUser.getUserPhone().substring(0,3) + "****" +comUser.getUserPhone().substring(7));
        });

        return comments;
    }


}
