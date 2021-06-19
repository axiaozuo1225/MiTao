package com.qf.controller;

import com.qf.entity.EvlDetail;
import com.qf.entity.EvlType;
import com.qf.service.com.qf.service.IEvlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("html/evl")
public class EvlController {

    @Autowired
    private IEvlService evlService;

    @RequestMapping("showType")
    @ResponseBody
    public List<EvlType> showEvlType (String goodsId){
//        System.out.println(goodsId);

        return evlService.showEvlType(goodsId);

    }

    @RequestMapping("showDetail/{goodsId}")
    @ResponseBody
    public List<EvlDetail> showEvlDetail (@RequestBody String[] infoDetailIds, @PathVariable String goodsId){
//        System.out.println(goodsId);
//        System.out.println(infoDetailIds);
        return evlService.showDetail(goodsId,infoDetailIds);
    }
}
