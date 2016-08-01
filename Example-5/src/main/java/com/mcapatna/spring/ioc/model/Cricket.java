package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 19 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class Cricket {
	private String captain;

	public void showDetials() {
		System.out.println("The captain of cricket is " + captain);
	}

	
	public void setCaptain(String captain) {
		this.captain = captain;
	}

}
