package com.wang.yunmall.product.dao;

import com.wang.yunmall.product.entity.CategoryBrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 12:04:15
 */
@Mapper
public interface CategoryBrandDao extends BaseMapper<CategoryBrandEntity> {
	
}
