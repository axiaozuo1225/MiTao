package com.qf.service.com.qf.service;

import com.qf.entity.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> showCategory();

    Category showCategoryById(String categoryId);
}
