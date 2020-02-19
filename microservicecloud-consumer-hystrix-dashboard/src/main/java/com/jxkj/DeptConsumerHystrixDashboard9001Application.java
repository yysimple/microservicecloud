package com.jxkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerHystrixDashboard9001Application {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerHystrixDashboard9001Application.class, args);
    }
}
