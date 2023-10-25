package com.pro.product.service;



import com.pro.product.common.DecreaseStockInput;
import com.pro.product.common.ProductInfoOutput;
import com.pro.product.dataobject.ProductInfo;


import java.util.List;

/**
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 根据productId查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);

}
