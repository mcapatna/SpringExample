package com.mcapatna.spring.ioc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mcapatna.spring.ioc.model.GameOfThrones;

public class Hbo {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("mcapatna-context.xml");
		GameOfThrones h= (GameOfThrones) context.getBean("got_obj");
		h.m1();
	}
}
