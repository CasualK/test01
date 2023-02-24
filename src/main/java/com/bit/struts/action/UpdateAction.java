package com.bit.struts.action;

import com.bit.struts.model.DeptVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class UpdateAction implements Action, ModelDriven<DeptVo>,Preparable{
	DeptVo bean=null;
	
	
	//요청마다 객체를 만듦, 싱글톤패턴의 경우 보안에 치명적 다른사람의 데이터를 볼 수 있음
	@Override
	public void prepare() throws Exception {
		bean=new DeptVo();
	}
	
	@Override
	public DeptVo getModel() {
		return bean;
	}
	
	@Override
	public String execute() throws Exception {
		return Action.SUCCESS;
	}



}
