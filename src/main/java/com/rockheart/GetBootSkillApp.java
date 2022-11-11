package com.rockheart;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

//@ImportResource(locations = {"classpath:/config/spring.xml"})
@SpringBootApplication
public class GetBootSkillApp {

    public static void main(String[] args) {
        SpringApplication.run(GetBootSkillApp.class, args);
    }

}
