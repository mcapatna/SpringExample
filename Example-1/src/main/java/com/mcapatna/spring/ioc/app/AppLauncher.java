package com.mcapatna.spring.ioc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @author mcapatna,The Power House
 * @Since 18 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class AppLauncher {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("mcapatna-context.xml");
		AppMgr mgr=(AppMgr) context.getBean("hello");
		mgr.show();
	}
}