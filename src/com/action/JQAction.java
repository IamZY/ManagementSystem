package com.action;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.dao.GlobalDao;
import com.dao.JQDao;
import com.domain.Jq;

public class JQAction {

	private JQDao dao = new JQDao();
	private GlobalDao globalDao = new GlobalDao();
	///////////////////////////////////////////
	private List jqList = new ArrayList();
	private Jq jq;
	private String day;
	private String hour;
	private List jQList = new ArrayList();
	/////////////////////////////////////////////////
	public List getJqList() {
		return jqList;
	}

	public void setJqList(List jqList) {
		this.jqList = jqList;
	}
	
	public Jq getJq() {
		return jq;
	}

	public void setJq(Jq jq) {
		this.jq = jq;
	}
	
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public List getJQList() {
		return jQList;
	}
	
	public void setJQList(List list) {
		jQList = list;
	}
	
	///////////////////////////////////////////////////


	public String findJQLB(){
		
		List list = dao.findJQLB();
		
		jqList = list;
		
		
		return "success";
	}
	
	public String saveJQ(){
		
		if(Integer.parseInt(hour) < 8){
			double time = Double.parseDouble(day) + Double.parseDouble(hour)/24;
			//保留两位小数
			DecimalFormat df = new DecimalFormat("######0.00");   
			
			jq.setSc(String.valueOf(df.format(time)));
			jq.setZt("同意");
			dao.saveJQ(jq);
			
			return "success";
			
		}else {
			return "false";
		}
		
	}
	
	public String showJQ(){
		List list = globalDao.findAllList("Jq");
		
		jQList = list;
		
		return "success";
	}
	
}
