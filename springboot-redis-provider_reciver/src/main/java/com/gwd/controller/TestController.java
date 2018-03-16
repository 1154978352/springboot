package com.gwd.controller;

import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/** 
* @FileName TestController.java
* @Description:TODO
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年3月16日 下午5:47:20 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*
*/
@RestController
public class TestController {
	@Autowired
	CountDownLatch latch;
	@Autowired
	StringRedisTemplate template;
	
	@RequestMapping("/testProvider")
	@ResponseBody
	public String testProvider() {
		System.out.println("我要发送消息咯...");
		template.convertAndSend("msg", "欢迎使用redis的消息队列!");
		try {
		//发送消息连接等待中
			System.out.println("消息正在发送...");
		latch.await();
		} catch (InterruptedException e) {
			System.out.println("消息发送失败...");
		}
		return null;
	}
}
