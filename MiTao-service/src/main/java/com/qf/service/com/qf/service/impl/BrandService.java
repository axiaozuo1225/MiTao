package com.qf.service.com.qf.service.impl;

import com.qf.entity.Brand;
import com.qf.mapper.BrandMapper;
import com.qf.service.com.qf.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService implements IBrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> showBrandsByCategoryId(String categoryId) {
        return brandMapper.selectBrandsByCategoryId(categoryId);
    }
}
