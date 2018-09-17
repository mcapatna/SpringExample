package com.sample.controller;

public class Demo {

	public static void main(String[] args) {
		test t=test.RED;
		t.dispaly();
		
	}
	public enum test{
		RED,BLUE;
		void dispaly() {
			System.out.println("Demo.test.dispaly()");
		}
		 test() {
		System.out.println("Demo.test.test()");	
			
		}
	}

}
