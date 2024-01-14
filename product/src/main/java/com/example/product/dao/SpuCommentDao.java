package com.example.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.product.entity.SpuCommentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 *
 * @author HaiboLee
 * @email lihb2022@outlook.com
 * @date 2024-01-10 18:05:40
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {

}
