package com.action;

import java.util.ArrayList;
import java.util.List;

import com.dao.GlobalDao;
import com.dao.KQDao;
import com.domain.Kqb;

public class KQAction {

	private KQDao dao = new KQDao();
	private GlobalDao globalDao = new GlobalDao();
	/////////////////////////////////////////////
	private Kqb kqb;
	private List kqsdList = new ArrayList();
	private List kQList = new ArrayList();
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
	
	
	//////////////////////////////////////////////////////
	

	/**
	 * 
	 * @return
	 */
	
	public String findKQSD(){
		
		//�������ֵ��в��ҿ���ʱ��
		List list = dao.findKqsd();
		
		kqsdList = list;
		
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
