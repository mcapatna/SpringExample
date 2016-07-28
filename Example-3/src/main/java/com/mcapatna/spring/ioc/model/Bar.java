package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 18 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class Bar {
	private String msg;
	private int no;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void show() {
		System.out.println(msg);
		System.out.println(no);
	}
}
