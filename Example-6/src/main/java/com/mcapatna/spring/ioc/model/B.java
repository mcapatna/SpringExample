package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 19 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class B extends A {
	private int b;
	private String msg2;

	public void setB(int b) {
		this.b = b;
	}

	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}

	public void show() {
		System.out.println(msg2);
		System.out.println(b);
		System.out.println(msg1);
		System.out.println(a);

	}

}
