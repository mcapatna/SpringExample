package com.mcapatna.spring.ioc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mcapatna.spring.ioc.model.GameOfThrones;
/**
 * 
 * @author mcapatna,The Power House
 * @Since 30 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class Hbo {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("mcapatna-context.xml");
		GameOfThrones h= (GameOfThrones) context.getBean("got_obj");
		h.describe_All_houses();
	}
}
