package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//排除数据源的加载
@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@EnableEurekaClient
@EnableFeignClients //开启开关服务
public class ApplicationContext {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationContext.class, args);
	}

}
