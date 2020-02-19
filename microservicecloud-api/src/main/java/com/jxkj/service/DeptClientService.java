package com.jxkj.service;

import com.jxkj.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 功能描述：将微服务中的接口抽取出来公共调用
 *
 * @FeignClient 这个注解会去 (value = "MICROSERVICECLOUD-DEPT")这个微服务中调用这些接口
 *
 * 对应的资源请求路径是要与 MICROSERVICECLOUD-DEPT 这个微服务 对应的请求路劲一致
 *
 * @author wcx
 * @version 1.0
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT/dept/provider")
public interface DeptClientService {


    @PostMapping("/addDept")
    boolean addDept(Dept dept);

    @GetMapping("/findById")
    Dept findById(Long deptNo);

    @GetMapping("/findAll")
    List<Dept> findAll();
}
