package com.zavier.feignconsumer.client;

import com.zavier.feignconsumer.domain.User;
import com.zavier.feignconsumer.service.HelloServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hello-server", fallback = HelloServiceFallback.class)
public interface ComputeClient {

    @RequestMapping(value = "add", method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

    @RequestMapping(value = "hello", method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
