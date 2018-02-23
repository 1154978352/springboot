package com.gwd.model;

import org.springframework.data.annotation.Id;

/** 
* @FileName User.java
* @Description:TODO
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年2月23日 下午4:54:32 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*
*/
public class User {
	@Id
    private Long id;

    private String username;
    private Integer age;
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public User(Long id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }
}
