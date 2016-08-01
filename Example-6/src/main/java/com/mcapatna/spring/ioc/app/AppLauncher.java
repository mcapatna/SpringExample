package com.mcapatna.spring.ioc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mcapatna.spring.ioc.model.Mgr;

public class AppLauncher {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("mcapatna-context.xml");
		Mgr manager = (Mgr) context.getBean("manager");
		manager.famousSaying();

	}

}
