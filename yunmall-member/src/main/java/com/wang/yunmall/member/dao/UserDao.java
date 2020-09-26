package com.wang.yunmall.member.dao;

import com.wang.yunmall.member.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 15:57:46
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
