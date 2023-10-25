# API

### 商品列表

```shell
GET /sell/buyer/product/list
```

参数

```
无
```

返回

```json
{
    "code": 0,
    "msg": "成功",
    "data": [
        {
            "name": "热销榜",
            "type": 1,
            "foods": [
                {
                    "id": "123456",
                    "name": "手工冰粉",
                    "price": 6.6,
                    "description": "纯手工打造，夏日解暑佳品",
                    "icon": "http://xxx.com"
                }
            ]
        },
        {
            "name": "休闲零食",
            "type": 2,
            "foods": [
                {
                    "id": "123457",
                    "name": "卧龙锅巴",
                    "price": 5.9,
                    "description": "追剧伴侣，买一送一",
                    "icon": "http://xxx.com"
                }
            ]
        }
    ]
}
```

### 创建订单

```shell
POST /sell/buyer/order/create
```

参数

```shell
name: "任豪"
phone: "17796833573"
address: "电子科技大学"
openid: "ew3euwhd7sjw9diwkq" //用户的微信openid
items: [{
    productId: "1423113435324",
    productQuantity: 2 //购买数量
}]

```

返回

```json
{
  "code": 0,
  "msg": "成功",
  "data": {
      "orderId": "147283992738221" 
  }
}
```

### 订单列表

```shell
GET /sell/buyer/order/list
```

参数

```
openid: 18eu2jwk2kse3r42e2e
page: 0 //从第0页开始
size: 10
```

返回

```json
{
  "code": 0,
  "msg": "成功",
  "data": [
    {
      "orderId": "147283992738221",
      "buyerName": "任豪",
      "buyerPhone": "17796833573",
      "buyerAddress": "电子科技大学",
      "buyerOpenid": "ew3euwhd7sjw9diwkq",
      "orderAmount": 0,
      "orderStatus": 0,
      "payStatus": 0,
      "createTime": 1490171219,
      "updateTime": 1490171219,
      "orderDetailList": null
    },
    {
      "orderId": "161873371171128076",
      "buyerName": "任豪",
      "buyerPhone": "17796833573",
      "buyerAddress": "电子科技大学",
      "buyerOpenid": "18eu2jwk2kse3r42e2e",
      "orderAmount": 0,
      "orderStatus": 0,
      "payStatus": 0,
      "createTime": 1490171219,
      "updateTime": 1490171219,
      "orderDetailList": null
    }]
}
```

### 查询订单详情

```shell
GET /sell/buyer/order/detail
```

参数

```
openid: 18eu2jwk2kse3r42e2e
orderId: 161899085773669363
```

返回

```json
{
    "code": 0,
    "msg": "成功",
    "data": {
          "orderId": "161899085773669363",
          "buyerName": "任豪",
          "buyerPhone": "17796833573",
          "buyerAddress": "电子科技大学",
          "buyerOpenid": "18eu2jwk2kse3r42e2e",
          "orderAmount": 18,
          "orderStatus": 0,
          "payStatus": 0,
          "createTime": 1490177352,
          "updateTime": 1490177352,
          "orderDetailList": [
            {
                "detailId": "161899085974995851",
                "orderId": "161899085773669363",
                "productId": "157875196362360019",
                "productName": "芋圆啵啵奶茶",
                "productPrice": 9,
                "productQuantity": 2,
                "productIcon": "http://xxx.com",
                "productImage": "http://xxx.com"
            }
        ]
    }
}
```

### 取消订单

```
POST /sell/buyer/order/cancel
```

参数

```
openid: 18eu2jwk2kse3r42e2e
orderId: 161899085773669363
```

返回

```json
{
    "code": 0,
    "msg": "成功",
    "data": null
}
```

### 获取openid

```
重定向到 /sell/wechat/authorize
```

参数

```
returnUrl: http://xxx.com/abc  //【必填】
```

返回

```
http://xxx.com/abc?openid=oZxSYw5ldcxv6H0EU67GgSXOUrVg
```

### 支付订单
```重定向/sell/pay/create```

参数
```
orderId:xxxdfafasdfasdfasdf
returnUrl:http://xsdfdf.com/abc/order/asfdafadsf
```

返回
```
http://xsdfdf.com/abc/order/asfdafadsf
```

