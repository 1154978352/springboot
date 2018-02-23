package com.gwd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gwd.dao.RedisDao;
/** 
* @ProjectName spring-boot-redis
* @author JackHisen(gu.weidong) 
* @Date 2018年2月21日 下午8:00:27    
* @Version 1.0 
* @Description:
*/
@RestController
public class TestController {
	@Autowired
    RedisDao redisDao;
    @RequestMapping("/testRedis")
    public String testRedis(){
    	System.out.println("------------------------");
        redisDao.setKey("name","gwd");
        redisDao.setKey("age","18");
       System.out.println(redisDao.getValue("name"));
       System.out.println(redisDao.getValue("age"));
       return redisDao.getValue("name")+"今年"+redisDao.getValue("age")+"岁了！";
    }
}

