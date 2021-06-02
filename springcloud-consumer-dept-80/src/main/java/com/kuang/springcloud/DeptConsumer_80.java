package com.kuang.springcloud;

import com.kuang.MyRule.MyLBRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/31-18:57
 */
//Ribbon和Eureka整合以后, 客户端可以直接调用, 不用关心IP地址和端口号
@SpringBootApplication
@EnableEurekaClient  //eureka客户端
@RibbonClient(name="SPRINGCLOUD-PROVIDER-DEPT", configuration = MyLBRule.class)
public class DeptConsumer_80 {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class, args);
    }
}
