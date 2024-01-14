package com.example.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author HaiboLee
 * @email lihb2022@outlook.com
 * @date 2024-01-12 16:25:56
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

