package com.pro.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * Hystrix测试：
 * 回退；超时配置；熔断；
 * @author RenHao
 * @create 2023-09-08 15:10
 */
@RestController
@DefaultProperties(defaultFallback = "defaultFallback") //默认回退方法
public class HystrixController {

//    //超时配置，请求最长访问时间设置为3s，超时后调用defaultFallback方法
//	@HystrixCommand(commandProperties = {
//			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
//	})

//	@HystrixCommand(commandProperties = {
//			@HystrixProperty(name = "circuitBreaker.enabled", value = "true"),  				//设置开启熔断
//			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),	//时间窗口内的最小请求数
//			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), //休眠时间窗时间为10s
//			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),	//时间窗口内的错误率达到60%，断路器为打开状态，否则为关闭状态
//	})
    @HystrixCommand //方法内部触发异常或者超时，自动调用defaultFallback方法
//    @HystrixCommand(fallbackMethod = "fallback") //方法内部触发异常时，自动调用fallback方法
    @GetMapping("/getProductInfoList")
    public String getProductInfoList(@RequestParam("number") Integer number) {
        if (number % 2 == 0) {
            return "success";
        }

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("http://127.0.0.1:1080/product/listForOrder",
                Arrays.asList("00"),
                String.class);
    }

    private String fallback() {
        return "太拥挤了, 请稍后再试~~";
    }

    private String defaultFallback() {
        return "默认提示：太拥挤了, 请稍后再试~~";
    }
}
