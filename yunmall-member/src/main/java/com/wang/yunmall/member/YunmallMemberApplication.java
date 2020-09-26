package com.wang.yunmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.wang.yunmall.member.feign")
@SpringBootApplication
public class YunmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunmallMemberApplication.class, args);
    }

}
