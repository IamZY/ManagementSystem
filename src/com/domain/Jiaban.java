package com.domain;

/**
 * Jiaban entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Jiaban implements java.io.Serializable {

	// Fields

	private Long jno;
	private String sqrq;
	private String jbrq;
	private Double jbsc;
	private String jbyy;
	private String zt;
	private String spr;
	private String sqr;

	// Constructors

	/** default constructor */
	public Jiaban() {
	}

	/** full constructor */
	public Jiaban(String sqrq, String jbrq, Double jbsc, String jbyy,
			String zt, String spr, String sqr) {
		this.sqrq = sqrq;
		this.jbrq = jbrq;
		this.jbsc = jbsc;
		this.jbyy = jbyy;
		this.zt = zt;
		this.spr = spr;
		this.sqr = sqr;
	}

	// Property accessors

	public Long getJno() {
		return this.jno;
	}

	public void setJno(Long jno) {
		this.jno = jno;
	}

	public String getSqrq() {
		return this.sqrq;
	}

	public void setSqrq(String sqrq) {
		this.sqrq = sqrq;
	}

	public String getJbrq() {
		return this.jbrq;
	}

	public void setJbrq(String jbrq) {
		this.jbrq = jbrq;
	}

	public Double getJbsc() {
		return this.jbsc;
	}

	public void setJbsc(Double jbsc) {
		this.jbsc = jbsc;
	}

	public String getJbyy() {
		return this.jbyy;
	}

	public void setJbyy(String jbyy) {
		this.jbyy = jbyy;
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