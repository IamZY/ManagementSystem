package com.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.dao.GlobalDao;
import com.dao.JBDao;
import com.domain.Jiaban;

public class JBAction {

	private JBDao dao = new JBDao();
	private GlobalDao globalDao = new GlobalDao();
	///////////////////////////////////
	private Jiaban jb;
	private List jbList = new ArrayList();
	private String auth;
	private String ename;
	
	
	/////////////////////////////////
	public Jiaban getJb() {
		return jb;
	}

	public void setJb(Jiaban jb) {
		this.jb = jb;
	}
		
	public List getJbList() {
		return jbList;
	}

	public void setJbList(List jbList) {
		this.jbList = jbList;
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

	///////////////////////////////////////////////////////////////////////
	public String saveJB(){
		
		jb.setZt("待审批");
		dao.saveJB(jb);
		
		return "success";
	}
	
	public String showJB(){
		
		
		try {
			auth = new String(auth.getBytes("ISO8859-1"),"UTF-8");
			ename = new String(ename.getBytes("ISO8859-1"),"UTF-8");
	
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(auth.equals("管理员")){
			//
			
			List list = globalDao.findAllList("Jiaban");
			
			jbList = list;
			
			return "success";
			
		}else {

		
			List list = globalDao.findOneList("Jiaban", ename);			
						
			jbList = list;
			
			return "success";
		}
		
		
		
	}
	
	
	
	
	
	
	
}
