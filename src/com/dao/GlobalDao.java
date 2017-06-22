package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.domain.Chuchai;
import com.domain.Jq;
import com.hibernate.HibernateSessionFactory;

public class GlobalDao {
	
	public List findAllList(String tabletype){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "from " + tabletype;
		Query query = session.createQuery(hql);
		
		List list = query.list();
		
		return list;
	}
	
	
	public List findOneList(String tabletype,String sqr){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "from " + tabletype + " where sqr=?";
		Query query = session.createQuery(hql);
		query.setString(0, sqr);
		
		List list = query.list();
		
		return list;
	}
	
	
	
	public static void main(String[] args) {
		GlobalDao dao = new GlobalDao();
		//System.out.println(ccDao.findCCSC("ê°Ñô"));
		//System.out.println(dao.findAllList("Jq").get(0));
		List list = dao.findOneList("Jq","°üÔÃ");
		for(Object o : list){
			Jq jq = (Jq) o;
			System.out.println(jq.getKssj());
		}
		
	}
	
}
