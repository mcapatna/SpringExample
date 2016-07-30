package com.mcapatna.spring.ioc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mcapatna.spring.ioc.model.IndianGames;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 19 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class SportsMinister {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("mcapatna-context.xml");
		IndianGames games = (IndianGames) context.getBean("indianGames");
		games.showDetails();
	}
}
