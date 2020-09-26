package com.wang.yunmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.yunmall.product.entity.SkuEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 12:04:15
 */
public interface SkuService extends IService<SkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

