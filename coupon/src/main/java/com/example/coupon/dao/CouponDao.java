package com.example.coupon.dao;

import com.example.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author HaiboLee
 * @email lihb2022@outlook.com
 * @date 2024-01-12 15:00:02
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
