package com.wang.yunmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.yunmall.product.entity.SpuAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 12:04:16
 */
public interface SpuAttrValueService extends IService<SpuAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

