package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.domain.Sjzd;
import com.hibernate.HibernateSessionFactory;

public class SJZDDao {


	public List showSJZD(){
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "from Sjzd order by sno";
		Query query = session.createQuery(hql);
		
		List list = query.list();
		
		session.close();
		
		
		return list;
		
	}
	
	public List showDept(){
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select sm from Sjzd where lx='部门'";
		Query query = session.createQuery(hql);
		
		List list = query.list();
		
		session.close();
		
		
		return list;
	}
	
	public List showAuth(){
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select sm from Sjzd where lx='权限'";
		Query query = session.createQuery(hql);
		
		List list = query.list();
		
		session.close();
		
		
		return list;
	}
	
	public boolean updateSJZD(Sjzd sjzd){
		
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		
		String hql = "update Sjzd set lx=?,sm=? where sno=?";
		Query query = session.createQuery(hql);
		
		query.setString(0, sjzd.getLx());
		query.setString(1, sjzd.getSm());
		query.setLong(2, sjzd.getSno());
		
		query.executeUpdate();
		
		tx.commit();
		session.close();
		
		
		return true;
	}
	
	public boolean addSJZD(Sjzd sjzd){
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		
		session.save(sjzd);
		
		
		tx.commit();
		session.close();
		
		
		return true;
	}
	
	
	public boolean delSJZD(Sjzd sjzd){
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		
		String hql = "delete from Sjzd where sno=?";
		Query query = session.createQuery(hql);
		query.setLong(0, sjzd.getSno());
		
		query.executeUpdate();
		
		
		tx.commit();
		session.close();
		
		
		return true;
		
		
	}
	
}
