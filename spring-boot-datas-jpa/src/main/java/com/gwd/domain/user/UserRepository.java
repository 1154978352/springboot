package com.gwd.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

/** 
* @ProjectName spring-boot-datas-jpa
* @author JackHisen(gu.weidong) 
* @Date 2018年2月16日 下午1:52:01    
* @Version 1.0 
* @Description:
*/
public interface UserRepository extends JpaRepository<User, Integer>{

}

