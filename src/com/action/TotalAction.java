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
		//查找emp表统计员工信息
		for(int i = 0;i < empDao.findEmp().size();i++){
			TotalEmp emp = new TotalEmp();
			emp.setEname((String)empDao.findEmp().get(i));
			//查询请假天数
			if(jqDao.isExit((String)empDao.findEmp().get(i))){
				emp.setQj(jqDao.findJQSC((String)empDao.findEmp().get(i)));				
			}else {
				emp.setQj(0);
			}
			//查询出差天数
			if(ccDao.isExit((String)empDao.findEmp().get(i))){
				emp.setCc(ccDao.findCCSC((String)empDao.findEmp().get(i)));				
			}else {
				emp.setCc(0);
			}
			//查询加班天数
			if(jbDao.isExit((String)empDao.findEmp().get(i))){
				emp.setJb(jbDao.calJBSC((String)empDao.findEmp().get(i)));				
			}else {
				emp.setJb(0);
			}
			//查询调休天数
			if(txDao.isExit((String)empDao.findEmp().get(i))){
				emp.setTx(txDao.calTXSC((String)empDao.findEmp().get(i)));				
			}else {
				emp.setTx(0);
			}
			
			//迟到、早退、漏打卡、早会未到、早操未到、会议缺席
			emp.setCd(kqDao.countLB((String)empDao.findEmp().get(i), "迟到"));
			emp.setZt(kqDao.countLB((String)empDao.findEmp().get(i), "早退"));
			emp.setLdk(kqDao.countLB((String)empDao.findEmp().get(i), "漏"));
			emp.setZhwd(kqDao.countLB((String)empDao.findEmp().get(i), "早会未到"));
			emp.setZcwd(kqDao.countLB((String)empDao.findEmp().get(i), "早操未到"));
			emp.setHyqx(kqDao.countLB((String)empDao.findEmp().get(i), "会议缺席"));
			
			
			list.add(emp);
		}
		
		empList = list;
		
		
		return "success";
	}
	
}
