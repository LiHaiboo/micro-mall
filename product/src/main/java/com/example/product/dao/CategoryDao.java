package com.example.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author HaiboLee
 * @email lihb2022@outlook.com
 * @date 2024-01-10 18:05:40
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
