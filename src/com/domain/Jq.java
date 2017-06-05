package com.domain;

/**
 * Jq entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Jq implements java.io.Serializable {

	// Fields

	private Long jqno;
	private String kssj;
	private String jssj;
	private String sc;
	private String jqlx;
	private String jqyy;
	private String zt;
	private String spr;
	private String sqr;

	// Constructors

	/** default constructor */
	public Jq() {
	}

	/** full constructor */
	public Jq(String kssj, String jssj, String sc, String jqlx, String jqyy,
			String zt, String spr, String sqr) {
		this.kssj = kssj;
		this.jssj = jssj;
		this.sc = sc;
		this.jqlx = jqlx;
		this.jqyy = jqyy;
		this.zt = zt;
		this.spr = spr;
		this.sqr = sqr;
	}

	// Property accessors

	public Long getJqno() {
		return this.jqno;
	}

	public void setJqno(Long jqno) {
		this.jqno = jqno;
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

	public String getSc() {
		return this.sc;
	}

	public void setSc(String sc) {
		this.sc = sc;
	}

	public String getJqlx() {
		return this.jqlx;
	}

	public void setJqlx(String jqlx) {
		this.jqlx = jqlx;
	}

	public String getJqyy() {
		return this.jqyy;
	}

	public void setJqyy(String jqyy) {
		this.jqyy = jqyy;
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

}