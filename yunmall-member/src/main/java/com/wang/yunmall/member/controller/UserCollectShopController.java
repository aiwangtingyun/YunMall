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

import com.wang.yunmall.member.entity.UserCollectShopEntity;
import com.wang.yunmall.member.service.UserCollectShopService;
import com.wang.common.utils.PageUtils;
import com.wang.common.utils.R;



/**
 * 关注店铺表
 *
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 15:57:47
 */
@RestController
@RequestMapping("member/usercollectshop")
public class UserCollectShopController {
    @Autowired
    private UserCollectShopService userCollectShopService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:usercollectshop:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userCollectShopService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:usercollectshop:info")
    public R info(@PathVariable("id") Long id){
		UserCollectShopEntity userCollectShop = userCollectShopService.getById(id);

        return R.ok().put("userCollectShop", userCollectShop);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:usercollectshop:save")
    public R save(@RequestBody UserCollectShopEntity userCollectShop){
		userCollectShopService.save(userCollectShop);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:usercollectshop:update")
    public R update(@RequestBody UserCollectShopEntity userCollectShop){
		userCollectShopService.updateById(userCollectShop);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:usercollectshop:delete")
    public R delete(@RequestBody Long[] ids){
		userCollectShopService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
