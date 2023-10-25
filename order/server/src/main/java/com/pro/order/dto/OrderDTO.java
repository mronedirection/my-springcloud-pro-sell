package com.pro.order.dto;

import com.pro.order.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 订单
 * 将OrderMaster和OrderDetail合并，封装成DTO在创建订单时使用
 */
@Data
public class OrderDTO {

    /** 订单id. */
    private String orderId;

    /** 买家名字. */
    private String buyerName;

    /** 买家手机号. */
    private String buyerPhone;

    /** 买家地址. */
    private String buyerAddress;

    /** 买家微信Openid. */
    private String buyerOpenid;

    /** 订单总金额. */
    private BigDecimal orderAmount;

    /** 订单状态, 默认为0新下单. */
    private Integer orderStatus;

    /** 支付状态, 默认为0未支付. */
    private Integer payStatus;
    //1个订单可能包含多个OrderDetail(即一个订单中购买了多种商品)，因此使用List来存放该属性
    private List<OrderDetail> orderDetailList;
}
