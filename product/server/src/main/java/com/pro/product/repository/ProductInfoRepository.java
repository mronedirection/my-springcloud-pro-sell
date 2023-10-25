package com.pro.product.repository;


import com.pro.product.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * JpaRepository<Product, String>  第一个参数为具体的domain对象，第二个参数为主键类型
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String>{

    //根据商品状态查询商品
    List<ProductInfo> findByProductStatus(Integer productStatus);

    //根据productId查询商品列表
    List<ProductInfo> findByProductIdIn(List<String> productIdList);
}
