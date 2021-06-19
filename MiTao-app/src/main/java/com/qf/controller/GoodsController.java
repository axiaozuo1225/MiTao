package com.qf.controller;

import com.github.pagehelper.PageInfo;
import com.qf.entity.Comments;
import com.qf.entity.Goods;
import com.qf.entity.ResultVO;
import com.qf.service.com.qf.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.ResultSet;
import java.util.List;

@Controller
@RequestMapping("html/goods")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    @RequestMapping("show")
    @ResponseBody
    public PageInfo<Goods> showByPageAndWhere(@RequestParam(required = false, defaultValue = "1") String categoryId, @RequestParam(required = false) String brandId,
                                              @RequestParam(required = false, defaultValue = "1") String curPage) {

//        System.out.println(categoryId);
//        System.out.println(brandId);
//        System.out.println(curPage);
        PageInfo<Goods> pageInfo = goodsService.showByPageAndWhere(categoryId, brandId, curPage);
//        System.out.println(pageInfo.getList());
        return pageInfo;
    }

    @RequestMapping("info")
    @ResponseBody
    public Goods goodsInfo(String goodsId) {
//        System.out.println(goodsId);
        return goodsService.showGoodsInfo(goodsId);
    }

    @RequestMapping("addComments")
    @ResponseBody
    public ResultVO addComments(@RequestBody Comments comments) {
        int i = goodsService.addComments(comments);

        if (i > 0) {
            return ResultVO.success("评论成功!");
        } else {
            return ResultVO.fail("评论失败!");
        }
    }

    @RequestMapping("showComments")
    @ResponseBody
    public List<Comments> addComments(@RequestBody String goodsId) {
        return goodsService.showComments(goodsId);
    }
}
