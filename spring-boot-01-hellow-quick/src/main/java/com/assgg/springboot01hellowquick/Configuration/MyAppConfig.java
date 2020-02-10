package com.assgg.springboot01hellowquick.Configuration;

import com.assgg.springboot01hellowquick.service.sayHellowService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
public class MyAppConfig {
    @Bean
    public sayHellowService sayHellowService(){
        System.out.println("输出sayHellow相关数据！！！");
        return new sayHellowService();
    }
}
