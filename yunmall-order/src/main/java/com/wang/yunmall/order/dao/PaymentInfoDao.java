package com.wang.yunmall.order.dao;

import com.wang.yunmall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 15:52:37
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
