package com.example.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author HaiboLee
 * @email lihb2022@outlook.com
 * @date 2024-01-12 17:00:41
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

