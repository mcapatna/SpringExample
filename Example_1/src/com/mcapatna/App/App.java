package com.mcapatna.App;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mcapatna.manager.AppMgr;
/**
 * 
 * @author mcapatna
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("mcapatna.xml");
		AppMgr mgr=(AppMgr) context.getBean("hello");
		mgr.show();
	}
}