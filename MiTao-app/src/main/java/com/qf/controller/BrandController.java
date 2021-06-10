package com.qf.controller;

import com.qf.entity.Brand;
import com.qf.entity.Category;
import com.qf.service.com.qf.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private IBrandService brandService;

    @RequestMapping("show")
    @ResponseBody
    public List<Brand> showBrands (@RequestBody String categoryId){

        List<Brand> brands = brandService.showBrandsByCategoryId(categoryId);

        return brands;
    }
}
