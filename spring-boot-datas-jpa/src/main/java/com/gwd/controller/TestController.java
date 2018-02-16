package com.gwd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gwd.domain.stu.Stu;
import com.gwd.domain.stu.StuRepository;
import com.gwd.domain.user.User;
import com.gwd.domain.user.UserRepository;

/** 
* @ProjectName spring-boot-datas-jpa
* @author JackHisen(gu.weidong) 
* @Date 2018年2月16日 下午1:53:38    
* @Version 1.0 
* @Description:
*/
@RestController
public class TestController {
	@Autowired
	StuRepository stuReponsitory;
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/testStu")
	public String testStu() {
		Stu stu = stuReponsitory.findOne(1);
		return stu.getName();
	}
	
	@RequestMapping("/testUser")
	public String testUser() {
		User user = userRepository.findOne(6);
		return user.getUsername();
	}
}

