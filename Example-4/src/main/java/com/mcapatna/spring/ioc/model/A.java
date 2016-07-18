package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 18 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class A {
	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void show() {
		System.out.println(msg);
	}
}
