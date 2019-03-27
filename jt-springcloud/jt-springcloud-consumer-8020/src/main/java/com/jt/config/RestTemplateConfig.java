package com.jt.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

/**
 * SpringCloud模板配置类
 * @author tarena
 *
 */

@Configuration
public class RestTemplateConfig {
	
	@Bean
	@LoadBalanced //实现赋值均衡  默认轮询策略
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	

	/**
	 * 切换负载均衡的策略
	 * RoundRobinRule   轮询策略
	 * RandomRule       随机策略
	 * AvailabilityFilteringRule    首先会过滤掉故障机或者并发链接数超过阈值的服务器.剩余的机器轮询配置
	 * WeightedResponseTimeRule	 	服务器影响时间越快,则权重越高
	 * BestAvailableRule            最大可用策略，即先过滤出故障服务器后，选择一个当前并发请求数最小的
	 * @return
	 */
	/*
	 * @Bean public IRule getIRule() { //轮询策略 return new RoundRobinRule(); }
	 */
}
