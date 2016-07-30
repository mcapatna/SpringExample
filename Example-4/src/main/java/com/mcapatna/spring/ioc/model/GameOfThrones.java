package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 18 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class GameOfThrones {
	private WinterFell stark;
	private RiverRun tully ;

	public void setStark(WinterFell stark) {
		this.stark = stark;
	}

	public void setTully(RiverRun tully) {
		this.tully = tully;
	}

	public void describe_All_houses() {
		stark.describe();
		tully.describe();
	}
}
