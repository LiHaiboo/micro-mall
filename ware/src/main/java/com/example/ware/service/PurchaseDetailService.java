package com.example.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author HaiboLee
 * @email lihb2022@outlook.com
 * @date 2024-01-12 17:00:41
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

