package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 18 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class Hello {
	private Hai hai = null;
	private A aobj = null;

	public void setHai(Hai hai) {
		this.hai = hai;
	}

	public void setAobj(A aobj) {
		this.aobj = aobj;
	}

	public void m1() {
		hai.show();
		aobj.show();
	}
}
