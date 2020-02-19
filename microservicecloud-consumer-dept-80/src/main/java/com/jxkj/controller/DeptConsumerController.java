package com.jxkj.controller;

import com.jxkj.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 功能描述：消费者controller， 不在业务，重在消费
 *
 * @author wcx
 * @version 1.0
 */
@RestController
@RequestMapping("/dept/consumer")
public class DeptConsumerController {

    // private static final String REST_URL_PREFIX = "http://localhost:8001/";
    private static final String REST_URL_PREFIX = "http://microservicecloud-dept";

    /**
     * 使用RestTemplate需要传三个参数
     * （请求地址， 请求参数， 请求的返回值）
     */
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/addDept")
    public boolean addDept(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/provider/addDept", dept, Boolean.class);
    }

    @GetMapping("/findById")
    public Dept findById(Long deptNo) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/provider/findById?deptNo=" + deptNo, Dept.class);
    }

    @GetMapping("/findAll")
    public List findAll() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/provider/findAll", List.class);
    }

    @GetMapping("/discovery")
    public Object discovery() {
        return restTemplate.getForObject(
                REST_URL_PREFIX + "/dept/provider/discovery",
                Object.class);
    }


}
