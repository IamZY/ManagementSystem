package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.domain.Tiaoxiu;
import com.hibernate.HibernateSessionFactory;

public class TXDao {

	
	public boolean savaTX(Tiaoxiu tx){
		
		Session session = HibernateSessionFactory.getSession();
		
		Transaction tc = session.beginTransaction();
		
		session.save(tx);
		
		tc.commit();
		session.close();
		
		return true;
		
		
	}
	
	
	public double calTXSC(String person){
		Session session = HibernateSessionFactory.getSession();
		
		String hql="select sum(txsc) from Tiaoxiu where sqr=?";
		Query query = session.createQuery(hql);
		query.setString(0, person);
		
		String sc = (String) query.uniqueResult();
		
	
		return Double.parseDouble(sc);
	}
	
	
	public boolean isTx(String person){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql="from Tiaoxiu where sqr=?";
		Query query = session.createQuery(hql);
		query.setString(0, person);
		
		List list = query.list();
		
		if(list.isEmpty()){
			return false;
		}
		return true;
	}
	
	public boolean isExit(String ename){
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "from Tiaoxiu where sqr=?";
		Query query = session.createQuery(hql);
		query.setString(0, ename);
		List list = query.list();
		
		if(list.isEmpty()){
			return false;
		}
		
		return true;
		
	}
	
	
	
	public static void main(String[] args) {
		TXDao dao = new TXDao();
		System.out.println(dao.calTXSC("ê°Ñô"));
	}
}
