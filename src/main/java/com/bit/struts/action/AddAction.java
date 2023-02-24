package com.bit.struts.action;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bit.struts.model.DeptDao;
import com.bit.struts.model.DeptVo;
import com.opensymphony.xwork2.Action;

public class AddAction implements Action {
	private String title = "입력";

	public String getTitle() {
		return title;
	}

	@Override
	public String execute() throws Exception {
		return Action.SUCCESS;
	}

}
