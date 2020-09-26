package com.wang.yunmall.product.dao;

import com.wang.yunmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 12:04:16
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
