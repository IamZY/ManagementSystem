package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;



import com.domain.Jq;
import com.domain.Kqb;
import com.domain.SP;
import com.hibernate.HibernateSessionFactory;

public class JQDao {

	
	public List findJQLB(){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select sm from Sjzd where lx='假期类别'";
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
	
	
	public List JQSP(){
			
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select jqno,sqr,jqyy,zt from Jq where zt='待审批'";
		Query query = session.createQuery(hql);
		
		
		List list = query.list();
		
		session.close();
		return list;
	}
	
	
	public boolean updateJQ(SP sp){
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		String hql="update Jq set zt=?,spr=? where jqno=?";
		
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
		JQDao dao = new JQDao();
		//System.out.println(dao.findJQSC("臧阳"));
		//System.out.println(dao.isExit("baoyue"));
		
		SP sp = new SP();
		sp.setSpno(new Long(1157));
		sp.setZt("同意");
		sp.setSpr("臧阳");
		
		
		dao.updateJQ(sp);
		
	}
}
