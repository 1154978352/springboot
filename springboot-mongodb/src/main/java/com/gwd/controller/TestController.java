package com.gwd.controller;
/** 
* @FileName TestController.java
* @Description:TODO
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年2月23日 下午5:02:05 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gwd.model.User;
import com.gwd.repository.UserRepository;

@RestController
public class TestController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/testMongodb")
	public String testMongodb() {
		// 创建三个User，并验证User总数
		userRepository.save(new User(1L, "didi", 30));
		userRepository.save(new User(2L, "mama", 40));
		userRepository.save(new User(3L, "kaka", 50));
		System.out.println(userRepository.findAll().size());

		// 删除一个User，再验证User总数
		User u = userRepository.findOne(1L);
		userRepository.delete(u);
		System.out.println(userRepository.findAll().size());

		// 删除一个User，再验证User总数
		u = userRepository.findByUsername("mama");
		userRepository.delete(u);
		System.out.println(userRepository.findAll().size());
		return userRepository.findByUsername("kaka").getUsername();
	}
}
