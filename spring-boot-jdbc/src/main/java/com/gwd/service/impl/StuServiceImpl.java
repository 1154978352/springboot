package com.gwd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.gwd.model.Stu;
import com.gwd.service.StuService;
/** 
* @ProjectName spring-boot
* @author JackHisen(gu.weidong) 
* @Date 2018年2月14日 下午2:48:51    
* @Version 1.0 
* @Description:
*/
@Service
public class StuServiceImpl implements StuService{
	@Autowired
	@Qualifier("primaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate1;

	
	@Override
	public Stu getStuById(int id) {
		String sql="select * from stu where id=?";
		List<Stu> stu1 = jdbcTemplate1.query(sql,  new Object[]{id},new BeanPropertyRowMapper<Stu>(Stu.class));
		return stu1.get(0);
	}
}

