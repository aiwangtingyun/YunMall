package com.wang.yunmall.member.feign;

import com.wang.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: 王廷云
 * @createTime: 2020-08-30 15:23
 **/

@FeignClient("yunmall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/test")
    public R test();

}
