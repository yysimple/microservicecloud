package com.jxkj.controller;

import com.jxkj.entity.Dept;
import com.jxkj.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
@RestController
@RequestMapping("/dept/provider")
public class DeptProviderController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/addDept")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/findById")
    public Dept findById(Long deptNo){
        return deptService.findById(deptNo);
    }

    @GetMapping("/findAll")
    public List<Dept> findAll(){
        return deptService.findAll();
    }

    /**
     * 增加自己服务描述的接口
     * @return
     */
    @GetMapping("/discovery")
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println("总共有多少个微服务：" + list.size());

        //查询MICROSERVICECLOUD-DEPT 服务
        List<ServiceInstance> instances = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");

        //打印MICROSERVICECLOUD-DEPT服务信息
        for (ServiceInstance element :instances){
            System.out.println(element.getServiceId());
            System.out.println(element.getHost());
            System.out.println(element.getPort());
            System.out.println(element.getUri());
        }
        return this.discoveryClient;

    }
}
