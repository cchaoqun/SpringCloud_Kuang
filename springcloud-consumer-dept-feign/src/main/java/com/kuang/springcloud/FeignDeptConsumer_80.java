package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/31-18:57
 */
//Ribbon和Eureka整合以后, 客户端可以直接调用, 不用关心IP地址和端口号
@SpringBootApplication
@EnableEurekaClient  //eureka客户端
// feign客户端注解,并指定要扫描的包以及配置接口DeptClientService
@EnableFeignClients(basePackages = {"com.kuang.springcloud"})
//@ComponentScan("com.kuang.springcloud")// 切记不要加这个注解，不然会出现404访问不到
public class FeignDeptConsumer_80 {

    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_80.class, args);
    }
}
