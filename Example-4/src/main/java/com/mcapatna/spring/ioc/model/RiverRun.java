package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 18 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class RiverRun {
	private String motto;
	private String king;

	public void setMotto(String motto) {
		this.motto = motto;
	}

	public void setKing(String king) {
		this.king = king;
	}

	public void describe() {
		System.out.println("WinterFell is ruled by " + king + " & Its motto is " + motto);
	}
}
