package com.zavier.feignconsumer.web;

import com.zavier.feignconsumer.client.ComputeClient;
import com.zavier.feignconsumer.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ComputeClient computeClient;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public Integer add() {
        return computeClient.add(10, 20);
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello() {
        User user = new User();
        user.setName("zheng");
        user.setAge(18);
        return computeClient.hello(user);
    }
}
