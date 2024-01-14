package com.example.order.dao;

import com.example.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author HaiboLee
 * @email lihb2022@outlook.com
 * @date 2024-01-12 16:25:56
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
