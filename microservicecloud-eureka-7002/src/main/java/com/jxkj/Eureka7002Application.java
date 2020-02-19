package com.jxkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
@SpringBootApplication
/**
 * 启用eureka服务，接收其他服务的注册
 */
@EnableEurekaServer
public class Eureka7002Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7002Application.class,args);
    }

}
