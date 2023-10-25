package com.pro.product.controller;

import com.pro.product.config.BoyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RenHao
 * @create 2023-09-07 10:38
 */
@RestController
@RequestMapping("/boy")
public class BoyController {

    @Autowired
    private BoyConfig boyConfig;

    @GetMapping("/print")
    public String print(){
        return "name: " + boyConfig.getName() + ", age: " + boyConfig.getAge();
    }
}
