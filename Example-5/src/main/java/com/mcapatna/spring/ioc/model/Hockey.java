package com.mcapatna.spring.ioc.model;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 19 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class Hockey {
	private String captain;
	private int totalGoal;

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public void setTotalGoal(int totalGoal) {
		this.totalGoal = totalGoal;
	}

	public void showDetials() {
		System.out.println("The captain of Hockey is " + captain + " and his Total Goals are " + totalGoal);
	}

}
