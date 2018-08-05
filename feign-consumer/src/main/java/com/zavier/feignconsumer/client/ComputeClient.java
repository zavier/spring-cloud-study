package com.zavier.feignconsumer.client;

import com.zavier.helloserviceapi.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("hello-server")
public interface ComputeClient extends HelloService {

}