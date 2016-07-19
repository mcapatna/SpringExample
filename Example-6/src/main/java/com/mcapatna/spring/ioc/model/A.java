package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 19 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class A {
	int a;
	String msg1;

	public void setA(int a) {
		this.a = a;
	}

	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}

	public void show() {
		System.out.println(msg1);
		System.out.println(a);
	}

}
