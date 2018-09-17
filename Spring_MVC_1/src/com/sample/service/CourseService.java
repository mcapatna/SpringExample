package com.sample.service;

import java.util.ArrayList;

public class CourseService {

	public ArrayList<String> getCourses() {
		ArrayList<String> al = new ArrayList<>();
		al.add("Java");
		al.add("Servlet");
		al.add("JSP");
		al.add("Struts");
		return al;
	}
}
