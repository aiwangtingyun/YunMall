package com.wang.yunmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.yunmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 20:59:45
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

