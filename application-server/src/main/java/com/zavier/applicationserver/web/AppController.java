package com.zavier.applicationserver.web;

import com.zavier.helloserviceapi.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AppController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "hello", method = RequestMethod.POST)
    public String hello(@RequestBody User user) {
        ServiceInstance instance = client.getLocalServiceInstance();
        log.info("/hello, host:{}, srvice_id:{}", instance.getHost(), instance.getServiceId());
        return "hello " + user.getName() + ", " + user.getAge();
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return a + b;
    }

}
