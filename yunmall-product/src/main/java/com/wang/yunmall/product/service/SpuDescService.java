package com.wang.yunmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.yunmall.product.entity.SpuDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 12:04:16
 */
public interface SpuDescService extends IService<SpuDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

