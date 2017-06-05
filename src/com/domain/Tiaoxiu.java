package com.domain;

/**
 * Tiaoxiu entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Tiaoxiu implements java.io.Serializable {

	// Fields

	private Long tno;
	private String sqrq;
	private String wxsc;
	private String txsc;
	private String txyy;
	private String zt;
	private String spr;
	private String sqr;
	private String kssj;
	private String jssj;

	// Constructors

	/** default constructor */
	public Tiaoxiu() {
	}

	/** minimal constructor */
	public Tiaoxiu(String sqrq, String wxsc, String txsc, String txyy,
			String zt, String spr, String sqr, String jssj) {
		this.sqrq = sqrq;
		this.wxsc = wxsc;
		this.txsc = txsc;
		this.txyy = txyy;
		this.zt = zt;
		this.spr = spr;
		this.sqr = sqr;
		this.jssj = jssj;
	}

	/** full constructor */
	public Tiaoxiu(String sqrq, String wxsc, String txsc, String txyy,
			String zt, String spr, String sqr, String kssj, String jssj) {
		this.sqrq = sqrq;
		this.wxsc = wxsc;
		this.txsc = txsc;
		this.txyy = txyy;
		this.zt = zt;
		this.spr = spr;
		this.sqr = sqr;
		this.kssj = kssj;
		this.jssj = jssj;
	}

	// Property accessors

	public Long getTno() {
		return this.tno;
	}

	public void setTno(Long tno) {
		this.tno = tno;
	}

	public String getSqrq() {
		return this.sqrq;
	}

	public void setSqrq(String sqrq) {
		this.sqrq = sqrq;
	}

	public String getWxsc() {
		return this.wxsc;
	}

	public void setWxsc(String wxsc) {
		this.wxsc = wxsc;
	}

	public String getTxsc() {
		return this.txsc;
	}

	public void setTxsc(String txsc) {
		this.txsc = txsc;
	}

	public String getTxyy() {
		return this.txyy;
	}

	public void setTxyy(String txyy) {
		this.txyy = txyy;
	}

	public String getZt() {
		return this.zt;
	}

	public void setZt(String zt) {
		this.zt = zt;
	}

	public String getSpr() {
		return this.spr;
	}

	public void setSpr(String spr) {
		this.spr = spr;
	}

	public String getSqr() {
		return this.sqr;
	}

	public void setSqr(String sqr) {
		this.sqr = sqr;
	}

	public String getKssj() {
		return this.kssj;
	}

	public void setKssj(String kssj) {
		this.kssj = kssj;
	}

	public String getJssj() {
		return this.jssj;
	}

	public void setJssj(String jssj) {
		this.jssj = jssj;
	}

}