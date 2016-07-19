package com.mcapatna.spring.ioc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mcapatna.spring.ioc.model.Hello;

public class AppLauncher {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mcapatna-context.xml");
		Hello hello = (Hello) context.getBean("hello");
		hello.show();

	}

}
