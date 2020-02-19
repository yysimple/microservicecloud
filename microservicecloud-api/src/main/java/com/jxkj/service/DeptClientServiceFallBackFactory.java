package com.jxkj.service;

import com.jxkj.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wcx
 * @description 统一处理DeptClientService这个类中的熔断
 * 作用是：想当于，在使用Feign去抽取公共接口时，对这些接口进行拦截，同一处理
 *
 * @Component 不要忘记添加
 */

@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {

        return new DeptClientService() {

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept findById(Long deptNo) {
               return new Dept().setDeptNo(deptNo)
                        .setDeptName("该deptNo没有对应的信息，Consumer客户端提供的降级信息，此刻服务provider已经关闭")
                        .setDbSource("没有这个数据库");
            }

            @Override
            public List findAll() {
                return null;
            }
        };
    }
}