package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dao.EmployeeDao;
import com.dao.GlobalDao;
import com.dao.LoginDao;
import com.domain.Employee;

public class LoginAction {
	
	private LoginDao loginDao = new LoginDao();
	private EmployeeDao employeeDao = new EmployeeDao();
	//
	private Employee emp;
	private String errormsg;
	//set.get...
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public String getErrormsg() {
		return errormsg;
	}
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	
	////////////////////////////////////////////////////////////
	public String login(){
		
		if(loginDao.isLogin(emp)){
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			session.setAttribute("ename", emp.getEname());
			
			//’À∫≈µƒ»®œﬁ
			String auth = employeeDao.findAuth(emp.getEname());
			session.setAttribute("auth", auth);
			
			return "success";			
		}else {
			errormsg="’À∫≈ªÚ√‹¬Î¥ÌŒÛ";
			return "false";
		}
		
	}
	
}
