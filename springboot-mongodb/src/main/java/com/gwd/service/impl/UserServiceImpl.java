package com.gwd.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import com.gwd.model.PageModel;
import com.gwd.model.User;
import com.gwd.service.UserSevice;
/** 
* @FileName UserServiceImpl.java
* @Description:TODO
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年3月15日 上午11:29:23 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*
*/
@Service
public class UserServiceImpl implements UserSevice{
	@Autowired
	private MongoTemplate mongoTemplate;
	@Override
	public Page<User> paginationQuery(Integer pageNum) {
		SpringbootPageable pageable = new SpringbootPageable();
		PageModel pm=new PageModel();
	    Query query = new Query();
	    List<Order> orders = new ArrayList<Order>();  //排序
	    orders.add(new Order(Direction.DESC, "age"));
	    Sort sort = new Sort(orders);
	    // 开始页
	    pm.setPagenumber(pageNum);
	    // 每页条数
	    pm.setPagesize(5);
	    // 排序
	    pm.setSort(sort);
	    pageable.setPage(pm);
	 // 查询出一共的条数
	    Long count = mongoTemplate.count(query, User.class);
	    // 查询
	    List<User> list = mongoTemplate.find(query.with(pageable), User.class);
	    // 将集合与分页结果封装
	    Page<User> pagelist = new PageImpl<User>(list, pageable, count);
		return pagelist;
	}
}
