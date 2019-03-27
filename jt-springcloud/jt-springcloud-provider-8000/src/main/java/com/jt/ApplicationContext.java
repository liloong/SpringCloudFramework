package com.jt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@MapperScan("com.jt.dao")
@EnableEurekaClient //开启注册中心客户端
@EnableHystrix //开启断路器机制
public class ApplicationContext {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationContext.class, args);
	}
}
