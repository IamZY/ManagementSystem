package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.domain.SP;
import com.domain.Tiaoxiu;
import com.hibernate.HibernateSessionFactory;

public class TXDao {

	
	public boolean saveTX(Tiaoxiu tx){
		
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
	
	public List TXSP(){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select tno,sqr,txyy,zt from Tiaoxiu where zt='´ýÉóÅú'";
		Query query = session.createQuery(hql);
		
		
		List list = query.list();
		
		session.close();
		return list;
	}
	
	
	
	public boolean updateTX(SP sp){
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		String hql="update Tiaoxiu set zt=?,spr=? where tno=?";
		
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
		TXDao dao = new TXDao();
		System.out.println(dao.calTXSC("ê°Ñô"));
	}
}
