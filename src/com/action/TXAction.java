package com.action;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import com.dao.GlobalDao;
import com.dao.JBDao;
import com.dao.TXDao;
import com.domain.Tiaoxiu;

public class TXAction {

	private TXDao txDao = new TXDao();
	private GlobalDao globalDao = new GlobalDao();
	////////////////////////////////////
	private InputStream ajaxInputStream; 
	private Tiaoxiu tx;
	private List txList = new ArrayList();
	private String auth;
	private String ename;
	private String errMsg;
	
	////////////////////////////////////////////
	
	
	public Tiaoxiu getTx() {
		return tx;
	}

	public void setTx(Tiaoxiu tx) {
		this.tx = tx;
	}

	public InputStream getAjaxInputStream() {
		return ajaxInputStream;
	}

	public void setAjaxInputStream(InputStream ajaxInputStream) {
		this.ajaxInputStream = ajaxInputStream;
	}
	
	public List getTxList() {
		return txList;
	}

	public void setTxList(List txList) {
		this.txList = txList;
	}

	public String getAuth() {
		return auth;
	}
	
	public void setAuth(String auth) {
		this.auth = auth;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	
	
	////////////////////////////////////////////////////////
	

	public String calTx(){
		
		//
		System.out.println(tx.getTxsc());
		//System.out.println(tx.getSqr());
		String sqr = tx.getSqr();
		try {
			sqr = new String(sqr.getBytes("ISO8859-1"),"utf-8");
			//System.out.println(sqr);
		
			//����δ��ʱ��  ���мӰ�ʱ��-���е���ʱ��
			double jbsc = 0;
			double txsc = 0;
			
			
			JBDao jbDao = new JBDao();
			//��ѯ֮ǰ�Ƿ��мӰ��¼
			if(jbDao.isJb(sqr)){
				jbsc = jbDao.calJBSC(sqr);				
			}else {
				jbsc = 0;
			}
			//
			TXDao txDao = new TXDao();
			//��ѯ֮ǰ�Ƿ��е��ݼ�¼
			if(txDao.isTx(sqr)){
				txsc = txDao.calTXSC(sqr);
			}else {
				txsc = 0;
			}
					
			double wxsc = jbsc-txsc;
			
			ajaxInputStream = new StringBufferInputStream(String.valueOf(wxsc));
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "success";
	}
	
	
	public String saveTX(){
		
		if(Double.parseDouble(tx.getTxsc()) <= Double.parseDouble(tx.getWxsc())){
			tx.setZt("������");
			txDao.saveTX(tx);
			return "success";
		}else {
			errMsg = "����ʧ��";
			return "false";
		}
		
	}
	
	public String showTX(){
		
		try {
			auth = new String(auth.getBytes("ISO8859-1"),"UTF-8");
			ename = new String(ename.getBytes("ISO8859-1"),"UTF-8");
	
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(auth.equals("����Ա")){
			//
			
			List list = globalDao.findAllList("Tiaoxiu");
			
			txList = list;
			
			return "success";
			
		}else {

		
			List list = globalDao.findOneList("Tiaoxiu", ename);			
						
			txList = list;
			
			return "success";
		}
		
		
		
		
		
	}

	
	
	
}
