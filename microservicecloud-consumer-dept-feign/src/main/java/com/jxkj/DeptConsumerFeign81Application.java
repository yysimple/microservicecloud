package com.jxkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
/**
 * 在启动该微服务式是能去加载我们定义的Feign配置类
 *
 * 去加载加上了注解 @FeignClient(value = "MICROSERVICECLOUD-DEPT") 的类 DeptClientService
 *
 * 就可以直接调用这个接口里面的方法了
 *
 * 使用Feign之后，这个可以不加，Feign集成了Ribbon
 */
@EnableFeignClients(basePackages = "com.jxkj")
public class DeptConsumerFeign81Application {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign81Application.class, args);
    }
}
