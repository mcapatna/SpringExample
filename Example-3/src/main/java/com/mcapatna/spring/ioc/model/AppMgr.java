package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 18 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class AppMgr {
	private Bar barObj = null;
	private Foo fooObj = null;

	public void setBarObj(Bar barObj) {
		this.barObj = barObj;
	}

	public void setFooObj(Foo fooObj) {
		this.fooObj = fooObj;
	}

	public void m1() {
		barObj.show();
		fooObj.show();
	}
}
