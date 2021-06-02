package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * @author Chaoqun Cheng
 * @date 2021-06-2021/6/1-21:18
 */
@SpringBootApplication
@EnableZuulProxy  // 开启Zuul
public class ZullApplication_9527 {

    public static void main(String[] args) {
        SpringApplication.run(ZullApplication_9527.class, args);
    }
}
