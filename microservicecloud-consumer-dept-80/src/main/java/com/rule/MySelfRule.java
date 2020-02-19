package com.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：自定义负载均衡算法
 *
 * 注意：自定义的算法不能放在与启动类相同或其下级包类
 *
 * @author wcx
 * @version 1.0
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule mySelfRule(){
        /**
         * 使用自定义的随机算法
         */
        return new MyRandomRule();
    }
}
