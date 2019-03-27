package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.pojo.User;
import com.jt.service.UserService;

/**
 * 消费者的增删改查
 * @author tarena
 *
 */

@RestController
@RequestMapping("/consumer/")
public class UserController {

//
//	//切换服务的名称
//	private static final String LOCAL_URL = "http://provider-user/";
//	
//	@Autowired
//	private RestTemplate restTemplate;
//	
//	@RequestMapping("findAll")
//	public List<User> hello(){
//		String url = LOCAL_URL+"hello";
//		return restTemplate.getForObject(url, List.class);
//	}
//	
//	
//	/**
//	 * restTemplate参数说明：
//	 * 1.url	访问服务器地址
//	 * 2.request 请求参数
//	 * 3.responseType 返回值类型
//	 * @param user
//	 * @return
//	 */
//	@RequestMapping("saveUser/{id}/{name}/{age}/{sex}")
//	public String saveUser(User user) {
//		String url = LOCAL_URL+"saveUser";
//		//使用post提交用户的数据
//		return restTemplate.postForObject(url, user, String.class);
//	}
//	
//	
//	/**
//	 * 获取服务端信息
//	 */
//	@RequestMapping("getMsg")
//	public String getMsg() {
//		String url =LOCAL_URL+"getMsg";
//		return restTemplate.getForObject(url, String.class);
//	}
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("findAll")
	public List<User> findAll(){
		return userService.HelloSpringCloud();
	}
	
	//实现用户新增
	@RequestMapping("saveUser/{name}/{age}")
	public String saveUser(User user) {
		return userService.saveUser(user);
	}
	
	//获取当前是哪个服务器
	@RequestMapping("getMsg")
	public String getMsg() {
		return userService.getMsg();
	}
	

	
}
