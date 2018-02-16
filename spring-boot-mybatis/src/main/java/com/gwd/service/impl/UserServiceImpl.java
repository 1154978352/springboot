package com.gwd.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
/** 
* @ProjectName spring-boot-mybatis
* @author JackHisen(gu.weidong) 
* @Date 2018年2月16日 下午10:09:43    
* @Version 1.0 
* @Description:
*/
import org.springframework.stereotype.Service;
import com.gwd.mapper.user.UserMapper;
import com.gwd.model.user.User;
import com.gwd.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	@Override
	public User getUserById(int id) {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}
}

