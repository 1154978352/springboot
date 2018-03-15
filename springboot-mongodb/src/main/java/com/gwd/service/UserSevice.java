package com.gwd.service;

import org.springframework.data.domain.Page;

import com.gwd.model.User;

/** 
* @FileName UserSevice.java
* @Description:TODO
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年3月15日 上午11:28:08 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*
*/
public interface UserSevice {
	public Page<User> paginationQuery(Integer pageNum);
}
