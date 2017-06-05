package com.action;

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

	public String saveJB(){
		
		jb.setZt("ЭЌвт");
		dao.saveJQ(jb);
		
		return "success";
	}
	
	public String showJB(){
		
		List list = globalDao.findAllList("Jiaban");
		
		jbList = list;
		
		return "success";
	}
	
	
	
	
	
	
	
}
