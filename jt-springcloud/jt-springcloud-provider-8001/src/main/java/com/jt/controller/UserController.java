package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.pojo.User;
import com.jt.service.UserService;
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
	public List<User> HelloSpringCloud() {
		return userService.selectAll();
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
		return "8001号服务器";
	}
	
	
}
