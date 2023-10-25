package com.pro.order.client;

import com.pro.order.dataobject.ProductInfo;
import com.pro.order.dto.CartDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * ORDER服务调用PRODUCT服务
 * @author RenHao
 * @create 2023-09-05 10:27
 */
//@FeignClient(name = "product")
public interface ProductClient {

    @GetMapping("/msg")
    String productMsg();

    //调用PRODUCT服务查询ProductInfo
    @PostMapping("/product/listForOrder")
    List<ProductInfo> listForOrder(@RequestBody List<String> productIdList);

    //调用PRODUCT服务扣库存
    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<CartDTO> cartDTOList);

}