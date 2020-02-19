package com.jxkj.controller;

import com.jxkj.entity.Dept;
import com.jxkj.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @Autowired
    private DeptClientService deptClientService;

    @PostMapping("/addDept")
    public boolean addDept(Dept dept) {
        return deptClientService.addDept(dept);
    }

    @GetMapping("/findById")
    public Dept findById(Long deptNo) {
        return deptClientService.findById(deptNo);
    }

    @GetMapping("/findAll")
    public List findAll() {
        return deptClientService.findAll();
    }

}
