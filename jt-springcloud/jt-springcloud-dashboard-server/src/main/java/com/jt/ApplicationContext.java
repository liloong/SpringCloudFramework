package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@EnableHystrixDashboard   //开启仪表盘监控
public class ApplicationContext {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationContext.class, args);
	}

}
