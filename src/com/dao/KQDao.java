package com.dao;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.domain.Kqb;
import com.hibernate.HibernateSessionFactory;

public class KQDao {

	public List findKqsd(){
	
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select sm from Sjzd where lx='考勤时段'";
		Query query = session.createQuery(hql);
		
		List list = query.list();
		
		session.close();
		
		return list;
		
	}
	
	
	public boolean saveKQ(Kqb kqb){
		
		Session session = HibernateSessionFactory.getSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(kqb);
		
		tx.commit();
		session.close();
		
		return true;
	}
	
	
	public long countLB(String ename,String lb){
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select count(*) from Kqb where ygxm=? and lb=?";
		Query query = session.createQuery(hql);
		query.setString(0, ename);
		query.setString(1, lb);
		
		
		long count = (Long) query.uniqueResult();
		
		
		return count;
		
	}
	
	public boolean isExit(String ename){
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "from Kqb where sqr=?";
		Query query = session.createQuery(hql);
		query.setString(0, ename);
		List list = query.list();
		
		if(list.isEmpty()){
			return false;
		}
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		KQDao dao = new KQDao();
		
		System.out.println(dao.countLB("大时代", "迟到"));
		
	}
	
	
}
