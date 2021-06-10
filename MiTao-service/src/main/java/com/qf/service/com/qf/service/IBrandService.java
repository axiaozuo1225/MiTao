package com.qf.service.com.qf.service;

import com.qf.entity.Brand;

import java.util.List;

public interface IBrandService {

    List<Brand> showBrandsByCategoryId(String categoryId);
}
