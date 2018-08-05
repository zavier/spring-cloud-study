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

3.在调用服务的方法上添加注解`@HystrixCommand(fallbackMethod="x")`执行回调方法