package com.example.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author HaiboLee
 * @email lihb2022@outlook.com
 * @date 2024-01-10 18:05:40
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

