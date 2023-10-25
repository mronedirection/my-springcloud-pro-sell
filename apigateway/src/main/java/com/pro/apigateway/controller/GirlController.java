package com.pro.apigateway.controller;

import com.pro.apigateway.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试统一配置中心是否生效
 * @author RenHao
 * @create 2023-09-06 17:34
 */
@RestController
@RequestMapping("/girl")
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @GetMapping("/print")
    public String print(){
        return "name: " + girlConfig.getName() + "age: " + girlConfig.getAge();
    }
}
