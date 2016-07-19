package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 18 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class B {
	int b;
	String msg;

	public B(int b, String msg) {
		super();
		this.b = b;
		this.msg = msg;
	}

	public void show() {
		System.out.println(b);
		System.out.println(msg);
	}
}