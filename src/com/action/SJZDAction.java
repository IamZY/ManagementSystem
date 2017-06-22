package com.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.dao.SJZDDao;
import com.domain.Sjzd;

public class SJZDAction {

	private SJZDDao dao = new SJZDDao();
	////////////////////////////////////////////////
	private List sjzdList = new ArrayList();
	private Sjzd sjzd;

	
	
	public Sjzd getSjzd() {
		return sjzd;
	}

	public void setSjzd(Sjzd sjzd) {
		this.sjzd = sjzd;
	}

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
	
	
	
	
	public String updateSJZD(){
			
		//update
		dao.updateSJZD(sjzd);
				
		return "success";
	}
	
	public String addSJZD(){
				
		dao.addSJZD(sjzd);
		
		
		return "success";
	}
	
	public String delSJZD(){
		
		dao.delSJZD(sjzd);
		
		return "success";
	}
	
}
