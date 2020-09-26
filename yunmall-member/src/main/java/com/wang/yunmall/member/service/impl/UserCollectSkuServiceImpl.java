package com.wang.yunmall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.common.utils.PageUtils;
import com.wang.common.utils.Query;

import com.wang.yunmall.member.dao.UserCollectSkuDao;
import com.wang.yunmall.member.entity.UserCollectSkuEntity;
import com.wang.yunmall.member.service.UserCollectSkuService;


@Service("userCollectSkuService")
public class UserCollectSkuServiceImpl extends ServiceImpl<UserCollectSkuDao, UserCollectSkuEntity> implements UserCollectSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserCollectSkuEntity> page = this.page(
                new Query<UserCollectSkuEntity>().getPage(params),
                new QueryWrapper<UserCollectSkuEntity>()
        );

        return new PageUtils(page);
    }

}