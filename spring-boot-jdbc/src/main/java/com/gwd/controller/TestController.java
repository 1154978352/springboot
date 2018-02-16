package com.gwd.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gwd.service.StuService;
import com.gwd.service.UserService;
/** 
* @ProjectName spring-boot
* @author JackHisen(gu.weidong) 
* @Date 2018年2月14日 下午3:07:43    
* @Version 1.0 
* @Description:
*/
@RestController 
public class TestController{
	@Autowired
	StuService stuService;
	@Autowired
	UserService userService;
	
	@RequestMapping("/testStu")
	public String testStu()  {
		return stuService.getStuById(1).getName();
	}
	
	@RequestMapping("/testUser")
	public String testUser() {
		return userService.getUserById(6).getUsername();
	}

}

