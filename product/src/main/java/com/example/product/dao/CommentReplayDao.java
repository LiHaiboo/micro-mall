package com.example.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.product.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author HaiboLee
 * @email lihb2022@outlook.com
 * @date 2024-01-10 18:05:40
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
