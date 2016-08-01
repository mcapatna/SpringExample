package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 19 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class Mgr {
	private LinesterHouse linesterHouse;
	private BoltonHouse boltonHouse;

	public void setLinesterHouse(LinesterHouse linesterHouse) {
		this.linesterHouse = linesterHouse;
	}

	public void setBoltonHouse(BoltonHouse boltonHouse) {
		this.boltonHouse = boltonHouse;
	}

	public void famousSaying() {
		if (linesterHouse != null)
			linesterHouse.famousSaying();
		if (boltonHouse != null)
			boltonHouse.famousSaying();
	}
}
