package com.gwd.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
* @FileName TestController.java
* @Description:TODO
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年2月27日 上午10:03:26 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*
*/
@RestController
public class TestController {
	@RequestMapping("/testAop")
	public void testAop() {
		System.out.println("test进行中");
	}
}
