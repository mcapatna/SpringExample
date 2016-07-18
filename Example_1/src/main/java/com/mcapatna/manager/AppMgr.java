package com.mcapatna.manager;

import com.mcapatna.pojo.A;
import com.mcapatna.pojo.B;
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

	A aobj;
	B bobj;

	public void show() {
		aobj.showA();
		bobj.show();
	}

	
	public A getAobj() {
		return aobj;
	}

	public void setAobj(A aobj) {
		this.aobj = aobj;
	}

	public B getBobj() {
		return bobj;
	}

	public void setBobj(B bobj) {
		this.bobj = bobj;
	}

}
