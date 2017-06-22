package com.action;

import java.util.ArrayList;
import java.util.List;

import com.dao.CCDao;
import com.dao.GlobalDao;
import com.dao.KQDao;
import com.domain.Kqb;

public class KQAction {

	private KQDao dao = new KQDao();
	private GlobalDao globalDao = new GlobalDao();
	private CCDao ccDao = new CCDao();
	/////////////////////////////////////////////
	private Kqb kqb;
	private List kqsdList = new ArrayList();
	private List kQList = new ArrayList();
	private List empList = new ArrayList();
	/////////////////////////////////////////////////////
	public Kqb getKqb() {
		return kqb;
	}

	public void setKqb(Kqb kqb) {
		this.kqb = kqb;
	}

	public List getKqsdList() {
		return kqsdList;
	}

	public void setKqsdList(List kqsdList) {
		this.kqsdList = kqsdList;
	}

	public List getKQList() {
		return kQList;
	}
	
	public void setKQList(List list) {
		kQList = list;
	}
	
	
	public List getEmpList() {
		return empList;
	}
	
	public void setEmpList(List empList) {
		this.empList = empList;
	}
	
	//////////////////////////////////////////////////////
	


	/**
	 * 
	 * @return
	 */
	
	public String findKQSD(){
		
		//从数据字典中查找考勤时段
		List list = dao.findKqsd();
		
		List list2 = ccDao.findTXRY();
		
		empList = list2;
		
		kqsdList = list;
		
		empList = list2;
		
		return "success";
	}
	
	public String saveKQ(){
		dao.saveKQ(kqb);
		
		return "success";
	}
	
	public String showKQ(){
		List list = globalDao.findAllList("Kqb");
		
		kQList = list;
		
		
		return "success";
	}
	
	
	
}
