package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.HibernateSessionFactory;

public class EmployeeDao {


	public List findEmp(){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql ="select ename from Employee";
		Query query = session.createQuery(hql);
		
		List list = query.list();
		
		return list;
	
	}
	
	/**
	 * 查询员工权限
	 * @return
	 */
	public String findAuth(String ename){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select auth from Employee where ename=?";
		Query query = session.createQuery(hql);
		query.setString(0, ename);
		
		String auth = (String)query.uniqueResult();
		
		
		return auth;
	}
	
	
	
	
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		
		System.out.println(dao.findAuth("臧阳"));
	}
	
}
