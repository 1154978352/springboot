package com.gwd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gwd.mapper.stu.StuMapper;
import com.gwd.model.stu.Stu;
import com.gwd.service.StuService;
/** 
* @ProjectName spring-boot-mybatis
* @author JackHisen(gu.weidong) 
* @Date 2018年2月16日 下午10:10:25    
* @Version 1.0 
* @Description:
*/
@Service
public class StuServiceImpl implements StuService{
	@Autowired
	StuMapper stuMapper;
	@Override
	public Stu getStuById(int id) {
		Stu stu = stuMapper.selectByPrimaryKey(id);
		return stu;
	}
}

