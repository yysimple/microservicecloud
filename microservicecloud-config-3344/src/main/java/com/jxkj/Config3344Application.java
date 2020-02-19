package com.jxkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class Config3344Application {
    public static void main(String[] args) {
        SpringApplication.run(Config3344Application.class, args);
    }
}
