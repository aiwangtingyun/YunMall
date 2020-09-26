package com.wang.yunmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 关注商品表
 * 
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 15:57:47
 */
@Data
@TableName("ums_user_collect_sku")
public class UserCollectSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * sku标题
	 */
	private String skuTitle;
	/**
	 * sku默认图片
	 */
	private String skuImage;
	/**
	 * 创建时间
	 */
	private Date createTime;

}
