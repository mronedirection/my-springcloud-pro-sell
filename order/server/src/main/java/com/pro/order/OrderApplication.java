package com.pro.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker
//以上三个注解包含于@SpringCloudApplication中
@SpringCloudApplication
@EnableHystrixDashboard
@EnableFeignClients(basePackages = "com.pro.product.client")
public class OrderApplication {

    public static void main(String[] args)  {
        SpringApplication.run(OrderApplication.class, args);
    }

}
