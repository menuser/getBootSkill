package com.rockheart.demo.config;

import com.rockheart.demo.service.EmpService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {

    @Bean
    public EmpService empService2(){
        System.out.println("@Bean注解已经将EmpService组件注入");
        return new EmpService();
    }

}
