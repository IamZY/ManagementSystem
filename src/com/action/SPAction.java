package com.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dao.CCDao;
import com.dao.JBDao;
import com.dao.JQDao;
import com.dao.TXDao;
import com.domain.SP;

public class SPAction {

	private List spList = new ArrayList();
	private SP sp;
	////////////////////////////////////////////////////	
	public List getSpList() {
		return spList;
	}


	public void setSpList(List spList) {
		this.spList = spList;
	}
	
	
	public SP getSp() {
		return sp;
	}


	public void setSp(SP sp) {
		this.sp = sp;
	}


	//////////////////////////////////////////////////////////////
	public String showSP(){
		
		//��ѯ���б��д�������
		List list = new ArrayList();

		//JQDao jqDao = new JQDao();
		
		//����
		for (Object o : new JQDao().JQSP()) {
			Object[] arr = (Object[]) o;
			list.add(new SP((Long)arr[0],(String)arr[1],"��������",(String)arr[2],(String)arr[3]));
		}
		
		//����
		for (Object o : new CCDao().CCSP()) {
			Object[] arr = (Object[]) o;
			list.add(new SP((Long)arr[0],(String)arr[1],"��������",(String)arr[2],(String)arr[3]));
		}
			
		//�Ӱ�
		for (Object o : new JBDao().JBSP()) {
			Object[] arr = (Object[]) o;
			list.add(new SP((Long)arr[0],(String)arr[1],"�Ӱ�����",(String)arr[2],(String)arr[3]));
		}	
			
		
		//����
		for (Object o : new TXDao().TXSP()) {
			Object[] arr = (Object[]) o;
			list.add(new SP((Long)arr[0],(String)arr[1],"��������",(String)arr[2],(String)arr[3]));
		}
		
		
		spList = list;
		
		
		return "success";
	}
	
	
	public String updateSP(){
				
		String[] zt = sp.getZt().split(",");
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		
		sp.setSpr((String)session.getAttribute("ename"));
			
		sp.setZt(zt[0]);

		//
		if(sp.getSqlx().equals("��������")){
			new JQDao().updateJQ(sp);
			
		}else if(sp.getSqlx().equals("��������")){
			
			new CCDao().updateCC(sp);
			
		}else if (sp.getSqlx().equals("�Ӱ�����")) {
			new JBDao().updateJB(sp);
		}else {
			//��������			
			new TXDao().updateTX(sp);			
		}
		
		return "success";
	}
	
	

}
