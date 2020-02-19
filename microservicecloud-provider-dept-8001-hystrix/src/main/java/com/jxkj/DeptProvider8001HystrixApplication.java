package com.jxkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
@SpringBootApplication
/**
 * 本服务启动后会自动注入eureka的服务中
 */
@EnableEurekaClient
/**
 * 发现服务
 */
@EnableDiscoveryClient
/**
 * 对熔断器开启支持
 */
@EnableCircuitBreaker
public class DeptProvider8001HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001HystrixApplication.class, args);
    }
}
