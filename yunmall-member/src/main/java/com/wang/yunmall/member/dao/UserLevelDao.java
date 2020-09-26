package com.wang.yunmall.member.dao;

import com.wang.yunmall.member.entity.UserLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级表
 * 
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 15:57:47
 */
@Mapper
public interface UserLevelDao extends BaseMapper<UserLevelEntity> {
	
}
