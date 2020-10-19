package com.wang.yunamll.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class YunmallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunmallGatewayApplication.class, args);
    }

}
