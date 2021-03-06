package com.wang.yunmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.yunmall.ware.entity.WareOrderBillDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 16:01:35
 */
public interface WareOrderBillDetailService extends IService<WareOrderBillDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

