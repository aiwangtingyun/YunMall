package com.wang.yunmall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.common.utils.PageUtils;
import com.wang.common.utils.Query;

import com.wang.yunmall.member.dao.IntegrationHistoryDao;
import com.wang.yunmall.member.entity.IntegrationHistoryEntity;
import com.wang.yunmall.member.service.IntegrationHistoryService;


@Service("integrationHistoryService")
public class IntegrationHistoryServiceImpl extends ServiceImpl<IntegrationHistoryDao, IntegrationHistoryEntity> implements IntegrationHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IntegrationHistoryEntity> page = this.page(
                new Query<IntegrationHistoryEntity>().getPage(params),
                new QueryWrapper<IntegrationHistoryEntity>()
        );

        return new PageUtils(page);
    }

}