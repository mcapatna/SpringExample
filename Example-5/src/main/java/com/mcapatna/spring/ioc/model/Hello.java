package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 19 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class Hello {
	private Hai hai;
	private A aobj;

	public Hello(Hai hai, A aobj) {
		System.out.println("Hello.Hello(hai hai,A obj)");
		this.hai = hai;
		this.aobj = aobj;
	}

	public Hello() {
		System.out.println("Hello.Hello()");
	}

	public Hello(Hai hai) {
		System.out.println("Hello.Hello(Hai hai)");
		this.hai = hai;
	}

	public Hello(A aobj) {
		System.out.println("Hello.Hello(A aobj)");
		this.aobj = aobj;
	}

	void m1() {
		hai.show();
		aobj.show();
	}

}
