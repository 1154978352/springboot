package com.gwd.task;

import java.util.Random;
import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

/** 
* @FileName Task.java
* @Description:TODO
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年2月24日 下午2:48:47 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*
*/
@Component
public class Task {
	public static Random random =new Random();
	
	@Async
	public Future<String> taskOne() throws Exception {
	    System.out.println("开始做任务一");
	    long start = System.currentTimeMillis();
	    Thread.sleep(random.nextInt(10000));
	    long end = System.currentTimeMillis();
	    System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");
	    return new AsyncResult<>("任务一完成");
	}
	
	@Async
	public Future<String> taskTwo() throws Exception {
		System.out.println("开始执行任务二");
		long start=System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end=System.currentTimeMillis();
		System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");
		return new AsyncResult<>("任务二完成");
	}
	@Async
	public Future<String> taskThree() throws Exception {
		System.out.println("开始执行任务三");
		long start=System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end=System.currentTimeMillis();
		System.out.println("完成任务三，耗时：" + (end - start) + "毫秒");
		return new AsyncResult<>("任务三完成");
	}

}
