package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
//开启注册中心服务
@EnableEurekaServer
public class ApplicationContext {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationContext.class, args);
	}

}
