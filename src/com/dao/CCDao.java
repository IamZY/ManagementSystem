package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import sun.print.resources.serviceui;

import com.domain.Chuchai;
import com.domain.Employee;
import com.domain.SP;
import com.domain.Sjzd;
import com.hibernate.HibernateSessionFactory;

public class CCDao {

	
	public List findTXRY(){
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select ename from Employee";
		Query query = session.createQuery(hql);
		
		List list = query.list();
		
		session.close();
		
		return list;
	}
	
	public List findCXFS(){
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select sm from Sjzd where lx='出行方式'";
		Query query = session.createQuery(hql);
		
		List list = query.list();
		
		session.close();
		
		return list;
	}
	
	public boolean saveCC(Chuchai cc){
		
		Session session = HibernateSessionFactory.getSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(cc);
		
		tx.commit();
		session.close();
		
		return true;
		
	}
	
	public double findCCSC(String person){
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select sum(ccts) from Chuchai where sqr=?";
		Query query = session.createQuery(hql);
		
		query.setString(0, person);
		
		long sc = (Long) query.uniqueResult();
		
		session.close();
		
		return sc;
	}
	
	public boolean isExit(String ename){
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "from Chuchai where sqr=?";
		Query query = session.createQuery(hql);
		query.setString(0, ename);
		List list = query.list();
		
		if(list.isEmpty()){
			return false;
		}
		
		return true;
				
	}
	
	
	
	public List CCSP(){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select cno,sqr,txry,zt from Chuchai where zt='待审批'";
		Query query = session.createQuery(hql);
		
		
		List list = query.list();
		
		session.close();
		return list;
	}
	
	
	public boolean updateCC(SP sp){
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		String hql="update Chuchai set zt=?,spr=? where cno=?";
		
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
		CCDao ccDao = new CCDao();
		//System.out.println(ccDao.findCCSC("臧阳"));
		//System.out.println(ccDao.findAllList("Jq").get(0));
		List list = ccDao.findTXRY();
		
		for (int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	
}
