package com.gwd.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/** 
* @FileName WebLogAspect.java
* @Description:TODO
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年2月27日 上午9:32:17 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*
*/
@Component
@Aspect
public class WebLogAspect {
	@Pointcut("execution(public * com.gwd.web..*.*(..))")
	public void weblog() {}
	
	@Before("weblog()")
	public void webBefore() {
		System.out.println("在更新之前");
		System.out.println("stop");
		return;
	}
	
	@After("weblog()")
	public void webAfter() {
		System.out.println("在更新之后");
	}
	
	@Around("weblog()")
	public void webAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕通知前……");
		pjp.proceed();
		System.out.println("环绕通知后……");
	}
	
	@AfterReturning("weblog()")
	public void webAfterReturn() {
		System.out.println("afterReturning ……");
	}
}
