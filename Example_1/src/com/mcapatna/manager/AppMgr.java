package com.mcapatna.manager;

import com.mcapatna.pojo.A;
import com.mcapatna.pojo.B;

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

	public static void main(String[] args) {
		System.out.println("AppMgr.main()");
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
