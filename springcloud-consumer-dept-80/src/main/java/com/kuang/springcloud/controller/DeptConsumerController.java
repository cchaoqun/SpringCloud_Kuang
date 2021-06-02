package com.kuang.springcloud.controller;

import com.kuang.springcloud.pojo.Dept;
import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    //理解: 消费者不应该有service层
    // RestTemplate 供我们直接调用就可以了  注册到spring中
    //(url, 实体: map,Class<T>responseType)
    @Autowired
    private RestTemplate restTemplate;//提供多种便捷访问远程http服务的方法, 简单的restful服务模板

    //Ribbon 我们这里的地址, 应该是一个变量, 通过服务者来访问
//    private String REST_URL_PREFIX = "http://localhost:8001";
    private String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/add")
    public boolean addDept(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
    }
}
