package com.action;

import java.util.ArrayList;
import java.util.List;

import com.dao.CCDao;
import com.dao.GlobalDao;
import com.domain.Chuchai;

public class CCAction {

	private CCDao ccDao = new CCDao();
	private GlobalDao globalDao = new GlobalDao();
	
	///////////////////////////////////////
	private Chuchai cc;
	private List ccfsList = new ArrayList();
	private List txryList = new ArrayList();
	private List ccList = new ArrayList();
	
	////////////////////////////////////////
	public Chuchai getCc() {
		return cc;
	}

	public void setCc(Chuchai cc) {
		this.cc = cc;
	}
	
	public List getCcfsList() {
		return ccfsList;
	}

	public void setCcfsList(List ccfsList) {
		this.ccfsList = ccfsList;
	}

	public List getTxryList() {
		return txryList;
	}

	public void setTxryList(List txryList) {
		this.txryList = txryList;
	}
	
	

	public List getCcList() {
		return ccList;
	}

	public void setCcList(List ccList) {
		this.ccList = ccList;
	}

	//查找同行人员 查找出行方式
	public String findTypes(){
		
		List list = ccDao.findTXRY();
		List l = ccDao.findCXFS();
		
		txryList = list;
		ccfsList = l;
		
		
		return "success";
	}

	public String saveCC(){
		
		cc.setCcts(Long.valueOf(cc.getCcts()));
		
		cc.setZt("同意");
	
		ccDao.saveCC(cc);
		
		return "success";
	}
	
	public String showCC(){
		List list = globalDao.findAllList("Chuchai");
		
		ccList = list;
		
		return "success";
	}
	
}
