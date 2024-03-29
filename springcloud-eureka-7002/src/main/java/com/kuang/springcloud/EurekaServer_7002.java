package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/31-20:23
 */
//启动之后访问 http://localhost:7001/
@SpringBootApplication
@EnableEurekaServer  //服务端的启动类, 可以接受别人注册进来
public class EurekaServer_7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7002.class, args);
    }
}
