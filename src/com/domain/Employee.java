package com.domain;

/**
 * Employee entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private String empno;
	private String ename;
	private String password;
	private String dept;
	private String auth;

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** minimal constructor */
	public Employee(String ename, String password) {
		this.ename = ename;
		this.password = password;
	}

	/** full constructor */
	public Employee(String ename, String password, String dept, String auth) {
		this.ename = ename;
		this.password = password;
		this.dept = dept;
		this.auth = auth;
	}

	// Property accessors

	public String getEmpno() {
		return this.empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAuth() {
		return this.auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

}