package com.wang.yunmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 关注活动表
 * 
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 15:57:47
 */
@Data
@TableName("ums_user_collect_subject")
public class UserCollectSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 用户id
	 */
	private Integer userId;
	/**
	 * 活动id
	 */
	private Long subjectId;
	/**
	 * 活动名称
	 */
	private String subjectName;
	/**
	 * 活动默认图片
	 */
	private String subjectImage;
	/**
	 * 活动链接
	 */
	private String subjectUrl;
	/**
	 * 关注时间
	 */
	private Date createTime;

}
