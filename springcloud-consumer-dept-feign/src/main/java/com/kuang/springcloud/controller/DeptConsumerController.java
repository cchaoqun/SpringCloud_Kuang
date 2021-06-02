package com.kuang.springcloud.controller;

import com.kuang.springcloud.pojo.Dept;
import com.kuang.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/31-18:35
 */
@RestController
public class DeptConsumerController {
    @Autowired
    private DeptClientService service;

    //消费方添加部门信息
    @RequestMapping("/consumer/dept/add")
    public boolean addDept(Dept dept){
        return this.service.addDept(dept);
    }

    //消费方根据id查询部门信息
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.service.queryById(id);
    }

    //消费方查询所有部门的信息
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return this.service.queryAll();
    }
}
