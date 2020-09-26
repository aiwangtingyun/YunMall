package com.wang.yunmall.coupon.dao;

import com.wang.yunmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 20:54:03
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
