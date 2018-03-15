package com.gwd.service.impl;

import java.io.Serializable;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import com.gwd.model.PageModel;
/** 
* @FileName SpringDataPageable.java
* @Description:分页公共类
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年3月15日 上午11:23:03 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*/
public class SpringbootPageable implements Serializable,Pageable{
	/**  
	 * @Fields: serialVersionUID 
	 * @Todo: TODO 
	 */ 
	private static final long serialVersionUID = 1L;
	
	PageModel page;
	
	public PageModel getPage() {
		return page;
	}

	public void setPage(PageModel page) {
		this.page = page;
	}

	@Override
	public Pageable first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getOffset() {
		// TODO Auto-generated method stub
		return (page.getPagenumber() - 1) * page.getPagesize();
	}

	@Override
	public int getPageNumber() {
		// TODO Auto-generated method stub
		return page.getPagenumber();
	}

	@Override
	public int getPageSize() {
		// TODO Auto-generated method stub
		return page.getPagesize();
	}


	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Pageable next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pageable previousOrFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sort getSort() {
		// TODO Auto-generated method stub
		return page.getSort();
	}

}
