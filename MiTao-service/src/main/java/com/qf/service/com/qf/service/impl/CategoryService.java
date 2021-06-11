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

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Category> showCategory() {
        return categoryMapper.selectCategory();
    }

    @Override
    public Category showCategoryById(String categoryId) {

        Category category = categoryMapper.selectCategoryById(categoryId);
        List<Brand> brands = brandMapper.selectBrandsByCategoryId(categoryId);
        category.setBrandList(brands);

//        System.out.println(category);
        return category;
    }


}
