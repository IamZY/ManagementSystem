package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.domain.Jiaban;
import com.domain.Jq;
import com.domain.SP;
import com.hibernate.HibernateSessionFactory;

public class JBDao {

	
	
	public boolean saveJB(Jiaban jb){
		
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
	
	
	public List JBSP(){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select jno,sqr,jbyy,zt from Jiaban where zt='´ýÉóÅú'";
		Query query = session.createQuery(hql);
		
		
		List list = query.list();
		
		session.close();
		return list;
	}
	
	
	public boolean updateJB(SP sp){
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		String hql="update Jiaban set zt=?,spr=? where jno=?";
		
		Query query = session.createQuery(hql);
		
		query.setString(0, sp.getZt());
		query.setString(1, sp.getSpr());
		query.setLong(2, sp.getSpno());
		
		query.executeUpdate();
		
		tx.commit();
		session.close();
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		JBDao dao = new JBDao();
		System.out.println(dao.calJBSC("ê°Ñô"));
	}
	
}
