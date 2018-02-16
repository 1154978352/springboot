package com.gwd.service;

import com.gwd.model.user.User;

/** 
* @ProjectName spring-boot-mybatis
* @author JackHisen(gu.weidong) 
* @Date 2018年2月16日 下午10:09:05    
* @Version 1.0 
* @Description:
*/
public interface UserService {
	User getUserById(int id);
}

