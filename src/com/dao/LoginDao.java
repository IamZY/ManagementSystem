package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.dao.iface.LoginIFace;
import com.domain.Employee;
import com.hibernate.HibernateSessionFactory;

public class LoginDao implements LoginIFace{

	
	/**
	 * 验证用户登录
	 */
	public boolean isLogin(Employee emp){
			
		Session session = HibernateSessionFactory.getSession();
		
		String hql ="from Employee where ename=? and password=?";
		Query query = session.createQuery(hql);
		query.setString(0, emp.getEname());
		query.setString(1, emp.getPassword());
		
		List list = query.list();
		
		session.close();
		
		if(list.isEmpty()){
			return false;
		}else {
			return true;
		}
		
	}
	
	
}
