package com.bit.struts.action;


import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bit.struts.model.DeptDao;
import com.bit.struts.model.DeptVo;
import com.opensymphony.xwork2.Action;

public class DeptAction implements Action {
	private int deptno;
	private DeptVo bean;
	private String title="수정";
	
	public String getTitle() {
		return title;
	}
	
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	public DeptVo getBean() {
		return bean;
	}
	
	@Override
	public String execute() throws Exception {
		bean = new DeptDao().findOne(deptno);
		return Action.SUCCESS;
	}

}
