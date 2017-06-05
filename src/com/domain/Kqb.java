package com.domain;

/**
 * Kqb entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Kqb implements java.io.Serializable {

	// Fields

	private Long kqbh;
	private String kqsj;
	private String lb;
	private String ygxm;
	private String kqsd;
	private String kqsm;
	private String jlr;

	// Constructors

	/** default constructor */
	public Kqb() {
	}

	/** full constructor */
	public Kqb(String kqsj, String lb, String ygxm, String kqsd, String kqsm,
			String jlr) {
		this.kqsj = kqsj;
		this.lb = lb;
		this.ygxm = ygxm;
		this.kqsd = kqsd;
		this.kqsm = kqsm;
		this.jlr = jlr;
	}

	// Property accessors

	public Long getKqbh() {
		return this.kqbh;
	}

	public void setKqbh(Long kqbh) {
		this.kqbh = kqbh;
	}

	public String getKqsj() {
		return this.kqsj;
	}

	public void setKqsj(String kqsj) {
		this.kqsj = kqsj;
	}

	public String getLb() {
		return this.lb;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	public String getYgxm() {
		return this.ygxm;
	}

	public void setYgxm(String ygxm) {
		this.ygxm = ygxm;
	}

	public String getKqsd() {
		return this.kqsd;
	}

	public void setKqsd(String kqsd) {
		this.kqsd = kqsd;
	}

	public String getKqsm() {
		return this.kqsm;
	}

	public void setKqsm(String kqsm) {
		this.kqsm = kqsm;
	}

	public String getJlr() {
		return this.jlr;
	}

	public void setJlr(String jlr) {
		this.jlr = jlr;
	}

}