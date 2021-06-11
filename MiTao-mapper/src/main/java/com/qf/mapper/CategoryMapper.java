package com.qf.mapper;

import com.qf.entity.Category;

import java.util.List;

public interface CategoryMapper {

    List<Category> selectCategory(String categoryId);

}
