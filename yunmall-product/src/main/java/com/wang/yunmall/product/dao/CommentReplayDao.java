package com.wang.yunmall.product.dao;

import com.wang.yunmall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 12:04:15
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
