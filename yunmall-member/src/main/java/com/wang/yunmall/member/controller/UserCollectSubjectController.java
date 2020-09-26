package com.wang.yunmall.member.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wang.yunmall.member.entity.UserCollectSubjectEntity;
import com.wang.yunmall.member.service.UserCollectSubjectService;
import com.wang.common.utils.PageUtils;
import com.wang.common.utils.R;



/**
 * 关注活动表
 *
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 15:57:47
 */
@RestController
@RequestMapping("member/usercollectsubject")
public class UserCollectSubjectController {
    @Autowired
    private UserCollectSubjectService userCollectSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:usercollectsubject:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userCollectSubjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:usercollectsubject:info")
    public R info(@PathVariable("id") Long id){
		UserCollectSubjectEntity userCollectSubject = userCollectSubjectService.getById(id);

        return R.ok().put("userCollectSubject", userCollectSubject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:usercollectsubject:save")
    public R save(@RequestBody UserCollectSubjectEntity userCollectSubject){
		userCollectSubjectService.save(userCollectSubject);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:usercollectsubject:update")
    public R update(@RequestBody UserCollectSubjectEntity userCollectSubject){
		userCollectSubjectService.updateById(userCollectSubject);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:usercollectsubject:delete")
    public R delete(@RequestBody Long[] ids){
		userCollectSubjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
