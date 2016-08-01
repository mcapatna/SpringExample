package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 19 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class BoltonHouse extends LinesterHouse {
	String bolton;
	String boltonQuote;

	public void setBolton(String bolton) {
		this.bolton = bolton;
	}

	public void setBoltonQuote(String boltonQuote) {
		this.boltonQuote = boltonQuote;
	}

	public void famousSaying() {
		System.out.println(bolton + " Said: " + boltonQuote);
		System.out.println(linester + " Said: " + linesterQuote);

	}

}
