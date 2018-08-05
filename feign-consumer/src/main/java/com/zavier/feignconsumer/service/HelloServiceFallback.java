package com.zavier.feignconsumer.service;

import com.zavier.feignconsumer.client.ComputeClient;
import com.zavier.feignconsumer.domain.User;
import org.springframework.stereotype.Component;

/**
 * 发生熔断时的处理类
 */
@Component
public class HelloServiceFallback implements ComputeClient {
    @Override
    public Integer add(Integer a, Integer b) {
        return a;
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
