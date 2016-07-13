package com.mcapatna.pojo;

/**
 * 
 * @author mcapatna
 *
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