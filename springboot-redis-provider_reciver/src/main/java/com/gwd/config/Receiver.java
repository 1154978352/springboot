package com.gwd.config;

import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;

/** 
* @FileName Receiver.java
* @Description:TODO
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年3月16日 下午4:44:08 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*
*/
public class Receiver {
	private CountDownLatch latch;

    @Autowired
    public Receiver(CountDownLatch latch) {
        this.latch = latch;
    }

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }
}
