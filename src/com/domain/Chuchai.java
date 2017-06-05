package com.domain;

/**
 * Chuchai entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Chuchai implements java.io.Serializable {

	// Fields

	private Long cno;
	private String ccrq;
	private Long ccts;
	private String txry;
	private String mdd;
	private String cxfs;
	private String ccsy;
	private String zt;
	private String spr;
	private String sqr;

	// Constructors

	/** default constructor */
	public Chuchai() {
	}

	/** full constructor */
	public Chuchai(String ccrq, Long ccts, String txry, String mdd,
			String cxfs, String ccsy, String zt, String spr, String sqr) {
		this.ccrq = ccrq;
		this.ccts = ccts;
		this.txry = txry;
		this.mdd = mdd;
		this.cxfs = cxfs;
		this.ccsy = ccsy;
		this.zt = zt;
		this.spr = spr;
		this.sqr = sqr;
	}

	// Property accessors

	public Long getCno() {
		return this.cno;
	}

	public void setCno(Long cno) {
		this.cno = cno;
	}

	public String getCcrq() {
		return this.ccrq;
	}

	public void setCcrq(String ccrq) {
		this.ccrq = ccrq;
	}

	public Long getCcts() {
		return this.ccts;
	}

	public void setCcts(Long ccts) {
		this.ccts = ccts;
	}

	public String getTxry() {
		return this.txry;
	}

	public void setTxry(String txry) {
		this.txry = txry;
	}

	public String getMdd() {
		return this.mdd;
	}

	public void setMdd(String mdd) {
		this.mdd = mdd;
	}

	public String getCxfs() {
		return this.cxfs;
	}

	public void setCxfs(String cxfs) {
		this.cxfs = cxfs;
	}

	public String getCcsy() {
		return this.ccsy;
	}

	public void setCcsy(String ccsy) {
		this.ccsy = ccsy;
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