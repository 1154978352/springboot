package com.gwd.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.gwd.model.User;

/** 
* @FileName UserRepository.java
* @Description:TODO
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年2月23日 下午4:56:03 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*
*/
public interface UserRepository extends MongoRepository<User, Long>{
	
	User findByUsername(String username);
}
