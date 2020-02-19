package com.jxkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

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
public class DeptProvider8003Application {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003Application.class, args);
    }
}
