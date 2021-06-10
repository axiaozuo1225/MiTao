package com.qf.mapper;

import com.qf.entity.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {

    List<Brand> selectBrandsByCategoryId(String categoryId);
}
