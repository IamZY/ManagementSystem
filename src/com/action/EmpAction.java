package com.action;

import java.util.ArrayList;
import java.util.List;

import com.dao.EmployeeDao;
import com.dao.SJZDDao;
import com.domain.Employee;

public class EmpAction {

	private SJZDDao dao = new SJZDDao();
	private EmployeeDao employeeDao = new EmployeeDao();
	///////////////////////////////////////////////////
	private Employee emp;
	private List deptList = new ArrayList();
	private List authList = new ArrayList();
	
	
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
		
	public List getDeptList() {
		return deptList;
	}

	public void setDeptList(List deptList) {
		this.deptList = deptList;
	}

	public List getAuthList() {
		return authList;
	}

	public void setAuthList(List authList) {
		this.authList = authList;
	}

	
	
	
	/////////////////////////////////////////////////////////
	public String tjyg(){
		
		
		//查询部门
		List list = dao.showDept();
		
		
		//查询权限
		List list2 = dao.showAuth();
		
		
		deptList = list;
		
		authList = list2;
		
		
		return "success";
	}
	
	
	public String addEmp(){
		
		employeeDao.addEmp(emp);
		
		return "success";
	}
	
	
	
}
