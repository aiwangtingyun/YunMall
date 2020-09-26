package com.wang.yunmall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.common.utils.PageUtils;
import com.wang.common.utils.Query;

import com.wang.yunmall.ware.dao.WareDao;
import com.wang.yunmall.ware.entity.WareEntity;
import com.wang.yunmall.ware.service.WareService;


@Service("wareService")
public class WareServiceImpl extends ServiceImpl<WareDao, WareEntity> implements WareService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareEntity> page = this.page(
                new Query<WareEntity>().getPage(params),
                new QueryWrapper<WareEntity>()
        );

        return new PageUtils(page);
    }

}