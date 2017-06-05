package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.domain.Jiaban;
import com.domain.Jq;
import com.hibernate.HibernateSessionFactory;

public class JBDao {

	
	
	public boolean saveJQ(Jiaban jb){
		
		Session session = HibernateSessionFactory.getSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(jb);
		
		tx.commit();
		session.close();
		
		return true;
	}
	
	public boolean isJb(String person){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql="from Jiaban where sqr=?";
		Query query = session.createQuery(hql);
		query.setString(0, person);
		
		List list = query.list();
		
		if(list.isEmpty()){
			return false;
		}
		return true;
	}

	public double calJBSC(String person){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql="select sum(jbsc) from Jiaban where sqr=?";
		Query query = session.createQuery(hql);
		query.setString(0, person);
		
		double sc = (Double) query.uniqueResult();
		
		return sc;
		
	}
	
	
	public boolean isExit(String ename){
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "from Jiaban where sqr=?";
		Query query = session.createQuery(hql);
		query.setString(0, ename);
		List list = query.list();
		
		if(list.isEmpty()){
			return false;
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		JBDao dao = new JBDao();
		System.out.println(dao.calJBSC("ê°Ñô"));
	}
	
}
