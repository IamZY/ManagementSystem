package com.action;

import java.util.ArrayList;
import java.util.List;

import com.dao.CCDao;
import com.dao.EmployeeDao;
import com.dao.JBDao;
import com.dao.JQDao;
import com.dao.KQDao;
import com.dao.TXDao;
import com.domain.TotalEmp;

public class TotalAction {

	private EmployeeDao empDao = new EmployeeDao();
	private JQDao jqDao = new JQDao();
	private CCDao ccDao = new CCDao();
	private JBDao jbDao = new JBDao();
	private TXDao txDao = new TXDao();
	private KQDao kqDao = new KQDao();
	///////////////////////////////////////////////////////
	private List empList = new ArrayList();
	
	
	///////////////////////////////////////////////////////	
	public List getEmpList() {
		return empList;
	}


	public void setEmpList(List empList) {
		this.empList = empList;
	}





	public String calEmp(){
		
		List list = new ArrayList();
		//����emp��ͳ��Ա����Ϣ
		for(int i = 0;i < empDao.findEmp().size();i++){
			TotalEmp emp = new TotalEmp();
			emp.setEname((String)empDao.findEmp().get(i));
			//��ѯ�������
			if(jqDao.isExit((String)empDao.findEmp().get(i))){
				emp.setQj(jqDao.findJQSC((String)empDao.findEmp().get(i)));				
			}else {
				emp.setQj(0);
			}
			//��ѯ��������
			if(ccDao.isExit((String)empDao.findEmp().get(i))){
				emp.setCc(ccDao.findCCSC((String)empDao.findEmp().get(i)));				
			}else {
				emp.setCc(0);
			}
			//��ѯ�Ӱ�����
			if(jbDao.isExit((String)empDao.findEmp().get(i))){
				emp.setJb(jbDao.calJBSC((String)empDao.findEmp().get(i)));				
			}else {
				emp.setJb(0);
			}
			//��ѯ��������
			if(txDao.isExit((String)empDao.findEmp().get(i))){
				emp.setTx(txDao.calTXSC((String)empDao.findEmp().get(i)));				
			}else {
				emp.setTx(0);
			}
			
			//�ٵ������ˡ�©�򿨡����δ�������δ��������ȱϯ
			emp.setCd(kqDao.countLB((String)empDao.findEmp().get(i), "�ٵ�"));
			emp.setZt(kqDao.countLB((String)empDao.findEmp().get(i), "����"));
			emp.setLdk(kqDao.countLB((String)empDao.findEmp().get(i), "©"));
			emp.setZhwd(kqDao.countLB((String)empDao.findEmp().get(i), "���δ��"));
			emp.setZcwd(kqDao.countLB((String)empDao.findEmp().get(i), "���δ��"));
			emp.setHyqx(kqDao.countLB((String)empDao.findEmp().get(i), "����ȱϯ"));
			
			
			list.add(emp);
		}
		
		empList = list;
		
		
		return "success";
	}
	
}
