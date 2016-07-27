package com.mcapatna.spring.ioc.app;

import com.mcapatna.spring.ioc.model.Foo;
import com.mcapatna.spring.ioc.model.Bar;
/**
 * 
 * @author mcapatna,The Power House
 * @Since 18 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class AppMgr {
	public AppMgr() {
		super();
	}

	Foo aobj;
	Bar bobj;

	public void show() {
		aobj.showA();
		bobj.show();
	}

	
	public Foo getAobj() {
		return aobj;
	}

	public void setAobj(Foo aobj) {
		this.aobj = aobj;
	}

	public Bar getBobj() {
		return bobj;
	}

	public void setBobj(Bar bobj) {
		this.bobj = bobj;
	}

}
