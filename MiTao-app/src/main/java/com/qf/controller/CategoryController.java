package com.qf.controller;

import com.qf.entity.Category;
import com.qf.service.com.qf.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private ICategoryService category;

    @RequestMapping("show")
    @ResponseBody
    public List<Category> showCategory(@RequestParam(required = false) String categoryId) {

        return category.showCategory(categoryId);
    }

}
