package com.gwd.service;

import com.gwd.model.stu.Stu;

/** 
* @ProjectName spring-boot-mybatis
* @author JackHisen(gu.weidong) 
* @Date 2018年2月16日 下午10:09:19    
* @Version 1.0 
* @Description:
*/
public interface StuService {
	Stu getStuById(int id);
}

