package com.gwd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.gwd.pojo.Events;
import com.gwd.pojo.States;

/** 
* @FileName TestController.java
* @Description:TODO
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年3月15日 下午8:11:24 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*
*/
@RestController
public class TestController {
	
	@Autowired
	private StateMachine<States, Events> stateMachine;
	
	@RequestMapping("/testMachine")
	@ResponseBody
	public void testMachine() {
		stateMachine.start();
		stateMachine.sendEvent(Events.PAY);
		stateMachine.sendEvent(Events.RECEIVE);
	}
}
