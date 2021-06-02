package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Chaoqun Cheng
 * @date 2021-06-2021/6/1-22:20
 */

@SpringBootApplication
@EnableConfigServer
public class Config_Server_3344 {

    public static void main(String[] args) {
        SpringApplication.run(Config_Server_3344.class, args);
    }
}
