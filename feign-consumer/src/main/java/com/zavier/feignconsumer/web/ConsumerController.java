package com.zavier.feignconsumer.web;

import com.zavier.feignconsumer.client.ComputeClient;
import com.zavier.helloserviceapi.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ComputeClient computeClient;

    @RequestMapping(value = "newHello", method = RequestMethod.GET)
    public String hello() {
        StringBuilder sb = new StringBuilder();
        sb.append(computeClient.hello("zheng1")).append("\n");
        sb.append(computeClient.hello("zheng2", 18)).append("\n");
        User user = new User();
        user.setName("zheng3");
        user.setAge(19);
        sb.append(computeClient.hello(user)).append("\n");
        return sb.toString();
    }

}
