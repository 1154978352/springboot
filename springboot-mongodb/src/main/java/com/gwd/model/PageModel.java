package com.gwd.model;

import java.io.Serializable;
import org.springframework.data.domain.Sort;

/** 
* @FileName PageModel.java
* @Description:分页模型
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年3月15日 下午3:39:35 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*/
public class PageModel implements Serializable{
	/**  
	 * @Fields: serialVersionUID 
	 * @Todo: TODO 
	 */ 
	private static final long serialVersionUID = 1L;
	// 当前页
    private Integer pagenumber = 1;
    // 当前页面条数
    private Integer pagesize = 10;
    // 排序条件
    private Sort sort;
	public Integer getPagenumber() {
		return pagenumber;
	}
	public void setPagenumber(Integer pagenumber) {
		this.pagenumber = pagenumber;
	}
	public Integer getPagesize() {
		return pagesize;
	}
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
	public Sort getSort() {
		return sort;
	}
	public void setSort(Sort sort) {
		this.sort = sort;
	}
}
