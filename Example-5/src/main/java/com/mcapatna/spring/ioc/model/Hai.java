package com.mcapatna.spring.ioc.model;

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
