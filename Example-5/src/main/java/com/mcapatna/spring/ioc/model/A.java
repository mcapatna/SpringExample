package com.mcapatna.spring.ioc.model;

public class A {
	private String msg;

	public void show() {
		System.out.println(msg);
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}
