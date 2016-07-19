package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 19 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class Hai {
	private String msg;
	private int n;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void show() {
		System.out.println(n);
		System.out.println(msg);
	}

}
