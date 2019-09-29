package com.joy.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 广告投放系统
 * Created by SongLiang on 2019-09-27
 */
@EnableFeignClients // 调用其他微服务
@EnableCircuitBreaker // 断路器
@EnableEurekaClient // 从注册中心拉取到其他的微服务配置
@SpringBootApplication
public class SponsorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SponsorApplication.class, args);
    }

}
