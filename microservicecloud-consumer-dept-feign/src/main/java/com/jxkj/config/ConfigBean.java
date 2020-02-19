package com.jxkj.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
@Configuration
public class ConfigBean {

    /**
     * 配置RestTemplate
     * 通过RestTemplate调用提供者服务 ，发送rest请求
     * 提供了多种访问http服务的方法，
     * 针对于访问rest服务<strong>客户端</strong>的调用的模板类
     * @return
     */
    @Bean
    /**
     * 加上这个注解就实现了负载均衡，但是使用Feign之后，这个可以不加，Feign集成了Ribbon
     */
    @LoadBalanced
    public RestTemplate getResTemplate() {
        return new RestTemplate();
    }

    /**
     * 使用随机算法，替换掉默认的轮询算法 return new RandomRule()
     * @return
     */
    @Bean
    public IRule myRule() {
        /**
         * 如果有一个服务提供出现down机，会在几个轮询后直接忽略这个微服务
         */
        return new RetryRule();
    }
}
