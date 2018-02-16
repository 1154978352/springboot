package com.gwd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.gwd.model.User;
import com.gwd.service.UserService;

/** 
* @ProjectName spring-boot
* @author JackHisen(gu.weidong) 
* @Date 2018年2月14日 下午9:38:51    
* @Version 1.0 
* @Description:
*/
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier("secondaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate2;
	
	public User getUserById(int id) {
		String sql ="select * from users where id =?";
		List<User> user = jdbcTemplate2.query(sql, new Object[] {id},new BeanPropertyRowMapper<User>(User.class));
		return user.get(0);
	}
}

