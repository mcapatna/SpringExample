package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 19 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class IndianGames {
	private Hockey indianHockey;
	private Cricket indianCricket;

	public IndianGames(Hockey indianHockey, Cricket indiancricket) {
		System.out.println("IndianGames.IndianGames()");
		this.indianHockey = indianHockey;
		this.indianCricket = indiancricket;
	}

	public IndianGames() {
		System.out.println("IndianGames.IndianGames()");
	}

	public IndianGames(Hockey indianHockey) {
		this.indianHockey = indianHockey;
	}

	public IndianGames(Cricket indiancricket) {
		this.indianCricket = indiancricket;
	}

	public void showDetails() {
		if (indianHockey != null) {
			indianHockey.showDetials();
		}
		if (indianCricket != null) {
			indianCricket.showDetials();
		}
	}

}
