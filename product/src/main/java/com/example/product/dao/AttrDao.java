package com.example.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.product.entity.AttrEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 *
 * @author HaiboLee
 * @email lihb2022@outlook.com
 * @date 2024-01-10 18:05:41
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {

}
