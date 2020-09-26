package com.wang.yunmall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.common.utils.PageUtils;
import com.wang.common.utils.Query;

import com.wang.yunmall.member.dao.UserStatisticsDao;
import com.wang.yunmall.member.entity.UserStatisticsEntity;
import com.wang.yunmall.member.service.UserStatisticsService;


@Service("userStatisticsService")
public class UserStatisticsServiceImpl extends ServiceImpl<UserStatisticsDao, UserStatisticsEntity> implements UserStatisticsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserStatisticsEntity> page = this.page(
                new Query<UserStatisticsEntity>().getPage(params),
                new QueryWrapper<UserStatisticsEntity>()
        );

        return new PageUtils(page);
    }

}