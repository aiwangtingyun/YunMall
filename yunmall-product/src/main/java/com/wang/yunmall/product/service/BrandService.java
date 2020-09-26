package com.wang.yunmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.yunmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 20:59:45
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

