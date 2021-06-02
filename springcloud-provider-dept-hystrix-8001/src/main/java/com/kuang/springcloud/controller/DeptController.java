package com.kuang.springcloud.controller;

import com.kuang.springcloud.pojo.Dept;
import com.kuang.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/31-17:59
 */

//提供Restful服务 ==> @ResponseBody + @Controller 方法返回的都是json数据
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    //根据id查询部门信息
    //如果根据id查询出现异常,则走hystrixGet这段备选代码
    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod="hystrixGet")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);

        if(dept==null){
            throw new RuntimeException("id=>"+id+" 不存在该用户, 或者信息无法找到");
        }
        return dept;
    }

    //根据id查询备选方案(熔断)
    public Dept hystrixGet(@PathVariable("id") Long id){
        return new Dept()
                .setDeptno(id)
                .setDname("id=>"+id+" 不存在该用户, 或者信息无法找到")
                .setDb_source("Valid database in MySQl not found");
    }

}
