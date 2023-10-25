package com.pro.apigateway.filter;

import com.google.common.util.concurrent.RateLimiter;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import com.pro.apigateway.exception.RateLimitException;
import org.springframework.stereotype.Component;

/**
 * @author RenHao
 * @create 2023-09-07 21:23
 */
@Component
public class RateLimitFilter extends ZuulFilter {

    //初始化令牌桶类，每秒放行100个请求。
    private static final RateLimiter RATE_LIMITER = RateLimiter.create(100);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //如果没有拿到令牌，则抛异常
        if (!RATE_LIMITER.tryAcquire()) {
            throw new RateLimitException();
        }
        return null;
    }
}
