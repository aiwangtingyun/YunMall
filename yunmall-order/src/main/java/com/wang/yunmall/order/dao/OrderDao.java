package com.wang.yunmall.order.dao;

import com.wang.yunmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 15:52:37
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
