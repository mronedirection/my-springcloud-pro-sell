package com.pro.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 （1）@SpringBootApplication 该注解告诉spring boot框架，这是项目的引导类
 （2）@EnableEurekaServer    该注解声明这是一个Eureka Server项目
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
