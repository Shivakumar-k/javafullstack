package com.xworkz.collection.map;

import java.util.HashMap;
import java.util.Map;

public class SoftwareCoursesRunner {
	
public static void main(String[] args) {
		
		Map<Integer, String> courses=new HashMap<>();
		
		courses.put(1, "Java");
		courses.put(2, "Web Tech");
		courses.put(3, "MySQL");
		courses.put(4, "Data Analyst");
		courses.put(5, "Devops");
		courses.put(6, ".Net");
		courses.put(7, "SAP");
		courses.put(8, "Phython");
		courses.put(9, "JDBC");
		courses.put(10, "Networking");
		
		System.out.println(courses);
		
		courses.remove(5);
		courses.remove(4, "Data Analyst");
		System.out.println(courses);
		
		System.out.println(courses.keySet());
		System.out.println(courses.values());
		System.out.println(courses.entrySet());
		
		courses.clear();
		System.out.println(courses);
		
		
	}

}
