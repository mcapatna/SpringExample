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

	Foo foo_Obj;
	Bar bar_Obj;

	public void show() {
		foo_Obj.showA();
		bar_Obj.show();
	}

	public void setFoo_Obj(Foo foo_Obj) {
		this.foo_Obj = foo_Obj;
	}

	public void setBar_Obj(Bar bar_Obj) {
		this.bar_Obj = bar_Obj;
	}

}
