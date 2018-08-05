# spring-cloud-study
Spring Cloud 学习

## 添加断路器
1.加入依赖
```xml
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-hystrix</artifactId>
</dependency>
```
2.消费方启动类中加入 `@EnableCircuitBreaker`注解

3.在调用服务的方法上添加注解`@HystrixCommand(fallbackMethod="x")`指定失败回调方法

## 声明式服务调用 Spring Cloud Feign
其整合了 Ribbon 与 Hystrix

1.加入依赖
```xml
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-feign</artifactId>
</dependency>
```
2.消费方启动类中加入 `@EnableFeignClients`注解

3.定义接口，加上注解`@FeignClient("hello-server")`，声明接口

