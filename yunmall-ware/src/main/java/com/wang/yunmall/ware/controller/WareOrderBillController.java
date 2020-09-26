package com.wang.yunmall.ware.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wang.yunmall.ware.entity.WareOrderBillEntity;
import com.wang.yunmall.ware.service.WareOrderBillService;
import com.wang.common.utils.PageUtils;
import com.wang.common.utils.R;



/**
 * 库存工作单
 *
 * @author 王廷云
 * @email wty1793172997@163.com
 * @date 2020-09-26 16:01:35
 */
@RestController
@RequestMapping("ware/wareorderbill")
public class WareOrderBillController {
    @Autowired
    private WareOrderBillService wareOrderBillService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ware:wareorderbill:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wareOrderBillService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("ware:wareorderbill:info")
    public R info(@PathVariable("id") Long id){
		WareOrderBillEntity wareOrderBill = wareOrderBillService.getById(id);

        return R.ok().put("wareOrderBill", wareOrderBill);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ware:wareorderbill:save")
    public R save(@RequestBody WareOrderBillEntity wareOrderBill){
		wareOrderBillService.save(wareOrderBill);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ware:wareorderbill:update")
    public R update(@RequestBody WareOrderBillEntity wareOrderBill){
		wareOrderBillService.updateById(wareOrderBill);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ware:wareorderbill:delete")
    public R delete(@RequestBody Long[] ids){
		wareOrderBillService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
