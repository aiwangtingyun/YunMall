package com.wang.yunmall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wang.yunmall.coupon.entity.SkuBoundsEntity;
import com.wang.yunmall.coupon.service.SkuBoundsService;
import com.wang.common.utils.PageUtils;
import com.wang.common.utils.R;



/**
 * 商品spu积分设置
 *
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 15:42:46
 */
@RestController
@RequestMapping("coupon/skubounds")
public class SkuBoundsController {
    @Autowired
    private SkuBoundsService skuBoundsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:skubounds:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = skuBoundsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:skubounds:info")
    public R info(@PathVariable("id") Long id){
		SkuBoundsEntity skuBounds = skuBoundsService.getById(id);

        return R.ok().put("skuBounds", skuBounds);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:skubounds:save")
    public R save(@RequestBody SkuBoundsEntity skuBounds){
		skuBoundsService.save(skuBounds);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:skubounds:update")
    public R update(@RequestBody SkuBoundsEntity skuBounds){
		skuBoundsService.updateById(skuBounds);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:skubounds:delete")
    public R delete(@RequestBody Long[] ids){
		skuBoundsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
