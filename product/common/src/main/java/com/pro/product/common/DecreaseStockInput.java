package com.pro.product.common;

import lombok.Data;

/**
 * 减库存入参
 * @author RenHao
 * @create 2023-09-05 21:17
 */
@Data
public class DecreaseStockInput {
    private String productId;

    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
