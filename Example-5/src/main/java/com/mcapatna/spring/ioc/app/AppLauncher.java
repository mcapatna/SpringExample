package com.mcapatna.spring.ioc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mcapatna.spring.ioc.model.Hello;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 19 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class AppLauncher {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mcapatna-context.xml");
		Hello hello = (Hello) context.getBean("hello");
		hello.m1();
	}
}
