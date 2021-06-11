package com.qf.service.com.qf.service.impl;

import com.qf.entity.Brand;
import com.qf.entity.Category;
import com.qf.mapper.BrandMapper;
import com.qf.mapper.CategoryMapper;
import com.qf.service.com.qf.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> showCategory(String categoryId) {

        List<Category> categories = categoryMapper.selectCategory(categoryId);

        return categories;

    }

}
