package com.jxkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul9527Application {
    public static void main(String[] args) {
        SpringApplication.run(Zuul9527Application.class, args);
    }
}
