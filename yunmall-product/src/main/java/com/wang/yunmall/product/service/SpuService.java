package com.wang.yunmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.yunmall.product.entity.SpuEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 12:04:16
 */
public interface SpuService extends IService<SpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

