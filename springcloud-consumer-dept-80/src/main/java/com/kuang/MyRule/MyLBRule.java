package com.kuang.MyRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Chaoqun Cheng
 * @date 2021-06-2021/6/1-1:44
 */
@Configuration
public class MyLBRule {

    @Bean
    public IRule myRule(){
        return new RoundRobinRule();  //默认是轮询, 现在定义为我们自定义的
    }
}
