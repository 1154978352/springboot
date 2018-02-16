package com.gwd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gwd.model.stu.Stu;
import com.gwd.model.user.User;
import com.gwd.service.StuService;
import com.gwd.service.UserService;

/** 
* @ProjectName spring-boot-mybatis
* @author JackHisen(gu.weidong) 
* @Date 2018年2月16日 下午9:54:52    
* @Version 1.0 
* @Description:
*/
@RestController
public class TestController {
	@Autowired
	UserService userService;
	
	@Autowired
	StuService stuService;
	
	@RequestMapping("getUser")
	public String getUser() {
		User user = userService.getUserById(6);
		return user.getUsername();
	}
	
	@RequestMapping("getStu")
	public String getStu() {
		Stu stu = stuService.getStuById(1);
		return stu.getName();
	}
}

