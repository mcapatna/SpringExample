package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 19 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class Hello {
	private A aobj = null;
	private B bobj = null;

	public void setAobj(A aobj) {
		this.aobj = aobj;
	}

	public void setBobj(B bobj) {
		this.bobj = bobj;
	}

	void show() {
		aobj.show();
		bobj.show();
	}
}
