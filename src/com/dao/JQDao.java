package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;



import com.domain.Jq;
import com.domain.Kqb;
import com.hibernate.HibernateSessionFactory;

public class JQDao {

	
	public List findJQLB(){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select sm from Sjzd where lx='¼ÙÆÚÀà±ð'";
		Query query = session.createQuery(hql);
		
		List list = query.list();
		
		session.close();
		
		return list;
		
	}
	
	public boolean saveJQ(Jq jq){
		
		Session session = HibernateSessionFactory.getSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(jq);
		
		tx.commit();
		session.close();
		
		return true;
	}
	
	public double findJQSC(String person){
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select sum(sc) from Jq where sqr=?";
		Query query = session.createQuery(hql);
		query.setString(0, person);
		String sc = (String) query.uniqueResult();
		
		session.close();
		
		return Double.parseDouble(sc);
	}
	
	
	public boolean isExit(String ename){
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "from Jq where sqr=?";
		Query query = session.createQuery(hql);
		query.setString(0, ename);
		List list = query.list();
		
		if(list.isEmpty()){
			return false;
		}
		
		return true;
		
	}
	
	
	
	
	public static void main(String[] args) {
		JQDao dao = new JQDao();
		//System.out.println(dao.findJQSC("ê°Ñô"));
		System.out.println(dao.isExit("baoyue"));
	}
}
