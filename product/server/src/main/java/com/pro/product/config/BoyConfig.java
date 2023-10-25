package com.pro.product.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author RenHao
 * @create 2023-09-07 10:37
 */
@Data
@Component
@ConfigurationProperties("boy")
@RefreshScope
public class BoyConfig {

    private String name;
    private Integer age;
}
