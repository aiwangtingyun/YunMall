package com.wang.yunmall.coupon.dao;

import com.wang.yunmall.coupon.entity.CouponSpuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 15:42:46
 */
@Mapper
public interface CouponSpuDao extends BaseMapper<CouponSpuEntity> {
	
}
