package com.wang.yunmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.yunmall.member.entity.UserAddressEntity;

import java.util.Map;

/**
 * 收货地址表
 *
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 15:57:47
 */
public interface UserAddressService extends IService<UserAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

