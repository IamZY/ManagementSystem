package com.domain;

/**
 * Sjzd entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Sjzd implements java.io.Serializable {

	// Fields

	private Long sno;
	private String lx;
	private String sm;

	// Constructors

	/** default constructor */
	public Sjzd() {
	}

	/** full constructor */
	public Sjzd(Long sno, String lx, String sm) {
		this.sno = sno;
		this.lx = lx;
		this.sm = sm;
	}

	// Property accessors

	public Long getSno() {
		return this.sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getLx() {
		return this.lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	public String getSm() {
		return this.sm;
	}

	public void setSm(String sm) {
		this.sm = sm;
	}

}