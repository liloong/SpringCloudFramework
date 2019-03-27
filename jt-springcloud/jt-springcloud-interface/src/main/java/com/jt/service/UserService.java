package com.jt.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.factory.UserFallBackFactory;
import com.jt.pojo.User;

@FeignClient(value="provider-user",fallbackFactory=UserFallBackFactory.class) //编辑服务的名称
public interface UserService {

	
	@RequestMapping("hello")
	@ResponseBody
	public List<User> HelloSpringCloud();
	
	
	/**
	 * @RequestBody 此注解表明将传递的JSON串动态的转化为对象
	 * @param user
	 * @return
	 */
	@RequestMapping("saveUser")
	@ResponseBody
	public String saveUser(@RequestBody User user);
	
	
	
	@RequestMapping("getMsg")
	@ResponseBody
	public String getMsg();
	
	
	
}
