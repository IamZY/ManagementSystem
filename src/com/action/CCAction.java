package com.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.dao.CCDao;
import com.dao.GlobalDao;
import com.domain.Chuchai;
import com.domain.Employee;

public class CCAction {

	private CCDao ccDao = new CCDao();
	private GlobalDao globalDao = new GlobalDao();
	
	///////////////////////////////////////
	private Chuchai cc;
	private List ccfsList = new ArrayList();
	private List txryList = new ArrayList();
	private List ccList = new ArrayList();
	private String auth;
	private String ename;
	
	
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

	public String getAuth() {
		return auth;
	}
	
	public void setAuth(String auth) {
		this.auth = auth;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	////////////////////////////////////////////////////////////
	

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
		
		cc.setZt("待审批");
	
		ccDao.saveCC(cc);
		
		return "success";
	}
	
	public String showCC(){
		
		try {
			auth = new String(auth.getBytes("ISO8859-1"),"UTF-8");
			ename = new String(ename.getBytes("ISO8859-1"),"UTF-8");
	
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(auth.equals("管理员")){
			//
			
			List list = globalDao.findAllList("Chuchai");
			
			ccList = list;
			
			return "success";
			
		}else {

			List list = globalDao.findOneList("Chuchai", ename);			
						
			ccList = list;
			
			return "success";
		}
		
		
		
		
	}
	
}
