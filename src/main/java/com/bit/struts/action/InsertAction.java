package com.bit.struts.action;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bit.struts.model.DeptDao;
import com.bit.struts.model.DeptVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Validateable;

public class InsertAction extends ActionSupport implements Validateable {
	private int deptno;
	private String dname, loc;
	private Map<String, List<String>> errs=new HashMap<>();
	
	
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public String getDname() {
		return dname;
	}

	public String getLoc() {
		return loc;
	}

	@Override
	public void validate() {
		if (deptno==0) {
			addFieldError("deptno", "값을 입력하세요");
		}
		if (dname.isEmpty()) {
//			errs.put("danme",Arrays.asList("값을 입력하세요"));
			addFieldError("dname", "값을 입력하세요");
		}	
		if (dname.trim().isEmpty()) {
			addFieldError("dname", "띄어쓰기만 입력");
		}	
		if (loc.isEmpty()) {
			addFieldError("loc", "값을 입력하세요");
		}
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("call execute");

		if(hasErrors()) return Action.INPUT;
		
		new DeptDao().insertOne(deptno, dname, loc);
		return Action.SUCCESS;
	}


}
