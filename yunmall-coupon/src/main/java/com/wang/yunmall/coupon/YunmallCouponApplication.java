package com.wang.yunmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class YunmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunmallCouponApplication.class, args);
    }

}
