package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.HibernateSessionFactory;

public class SJZDDao {

	
	
	
	public List showSJZD(){
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "from Sjzd order by lx";
		Query query = session.createQuery(hql);
		
		List list = query.list();
		
		session.close();
		
		
		return list;
		
	}
	
	
}
