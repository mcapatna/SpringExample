package com.mcapatna.spring.ioc.app;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mcapatna.spring.ioc.model.Customer;
import com.mcapatna.spring.ioc.model.Order;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 15 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mcapatna-context.xml");
		Customer c=(Customer) context.getBean("cust");
		System.out.println(c);
		Set<Order> orders=c.getOrder();
		for(Order o:orders){
			System.out.println(o);
		}
	}

}
