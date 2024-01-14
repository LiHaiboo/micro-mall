package com.example.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author HaiboLee
 * @email lihb2022@outlook.com
 * @date 2024-01-10 18:05:40
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

