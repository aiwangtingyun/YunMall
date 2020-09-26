package com.wang.yunmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.yunmall.member.entity.UserCollectSkuEntity;

import java.util.Map;

/**
 * 关注商品表
 *
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 15:57:47
 */
public interface UserCollectSkuService extends IService<UserCollectSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

