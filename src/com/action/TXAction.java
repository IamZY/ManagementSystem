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

	////////////////////////////////////////////////////////
	
	public String calTx(){
		
		//
		System.out.println(tx.getTxsc());
		//System.out.println(tx.getSqr());
		String sqr = tx.getSqr();
		try {
			sqr = new String(sqr.getBytes("ISO8859-1"),"utf-8");
			//System.out.println(sqr);
		
			//计算未休时间  所有加班时长-所有调休时长
			double jbsc = 0;
			double txsc = 0;
			
			
			JBDao jbDao = new JBDao();
			//查询之前是否有加班记录
			if(jbDao.isJb(sqr)){
				jbsc = jbDao.calJBSC(sqr);				
			}else {
				jbsc = 0;
			}
			//
			TXDao txDao = new TXDao();
			//查询之前是否有调休记录
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
		
		if(Double.parseDouble(tx.getTxsc()) < Double.parseDouble(tx.getWxsc())){
			tx.setZt("已申请");
			txDao.savaTX(tx);
			return "success";
		}else {
			return "false";
		}
		
	}
	
	public String showTX(){
		
		List list = globalDao.findAllList("Tiaoxiu");
		
		txList = list;
		
		return "success";
	}
	
	
}
