package com.pro.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RenHao
 * @create 2023-09-04 23:20
 */
@RestController
public class ServerController {
    @GetMapping("/msg")
    public String msg() {
        return "this is product' msg 1";
    }
}
