package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 19 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class LinesterHouse {
	String linester;
	String linesterQuote;

	public void setLinester(String linester) {
		this.linester = linester;
	}

	public void setLinesterQuote(String linesterQuote) {
		this.linesterQuote = linesterQuote;
	}

	public void famousSaying() {
		System.out.println(linester + " Said: " + linesterQuote);
	}

}
