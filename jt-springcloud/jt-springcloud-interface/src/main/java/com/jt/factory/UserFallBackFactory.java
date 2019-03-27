package com.jt.factory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.jt.pojo.User;
import com.jt.service.UserService;

import feign.hystrix.FallbackFactory;

@Component
public class UserFallBackFactory implements FallbackFactory<UserService>{

	/**
	 * 指定接口出现问题后，采用新创建的接口
	 */
	@Override
	public UserService create(Throwable cause) {
		
		//当程序调用出现异常实，采用接口熔断
		return new UserService() {
			
			@Override
			public String saveUser(User user) {
				return "后台服务器异常：调用熔断机制";
			}
			
			@Override
			public String getMsg() {
				return "后台服务器异常：调用熔断机制！！！";
			}
			
			@Override
			public List<User> HelloSpringCloud() {
				return new ArrayList<User>();
			}
		};
	}

}
