package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@EnableConfigServer //开启配置中心配置
public class ApplicationContext {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationContext.class, args);
	}

}
