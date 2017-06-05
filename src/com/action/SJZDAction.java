package com.action;

import java.util.ArrayList;
import java.util.List;

import com.dao.SJZDDao;

public class SJZDAction {

	private SJZDDao dao = new SJZDDao();
	////////////////////////////////////////////////
	private List sjzdList = new ArrayList();

	public List getSjzdList() {
		return sjzdList;
	}

	public void setSjzdList(List sjzdList) {
		this.sjzdList = sjzdList;
	}
	
	
	
	
	
	public String showSJZD(){
		
		List list = dao.showSJZD();
		
		sjzdList = list;
		
		
		return "success";
	}
	
	
	
	
	
	
	
	
	
	
}
