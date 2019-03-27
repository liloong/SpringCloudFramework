package com.jt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.pojo.User;
import com.jt.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
/**
 * 提供者
 * @author tarena
 *
 */

@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("hello")
	@ResponseBody
	@HystrixCommand(fallbackMethod="hystrix")  //此注解表示断路器机制 - 回退方法
	public List<User> HelloSpringCloud() {
		int a = 1/0;
		return userService.selectAll();
	}
	
	//断路器callback回退方法
	public List<User> hystrix(){
		List<User> userList = new ArrayList<>();
		User user = new User();
		user.setId(0);
		user.setName(null);
		user.setAge(0);
		user.setSex(null);
		userList.add(user);
		return userList;
	}
	
	
	/**
	 * @RequestBody 此注解表明将传递的JSON串动态的转化为对象
	 * @param user
	 * @return
	 */
	@RequestMapping("saveUser")
	@ResponseBody
	public String saveUser(@RequestBody User user) {
		userService.saveUser(user);
		return "新增用户成功"+user.getName();
	}
	
	@RequestMapping("getMsg")
	@ResponseBody
	public String getMsg() {
		return "8000号服务器";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
