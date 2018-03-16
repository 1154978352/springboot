package com.gwd.config;

import org.springframework.statemachine.annotation.OnTransition;
import org.springframework.statemachine.annotation.WithStateMachine;

/** 
* @FileName EventConfig.java
* @Description:TODO
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年3月16日 上午10:41:20 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*
*/
@WithStateMachine
public class EventConfig {

    @OnTransition(target = "UNPAID")
    public void create() {
       System.out.println("-------订单创建，待支付");
    }

    @OnTransition(source = "UNPAID", target = "WAITING_FOR_RECEIVE")
    public void pay() {
       System.out.println("---------用户完成支付，待收货");
    }

    @OnTransition(source = "WAITING_FOR_RECEIVE", target = "DONE")
    public void receive() {
       System.out.println("---------用户已收货，订单完成");
    }
}
