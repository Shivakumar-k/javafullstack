package com.xworkz.inheritance.boot;

import com.xworkz.abstraction.Project;
import com.xworkz.abstraction.ProjectMech;

public class ProjectRunner {
	
	public static void main(String[] args) {
		Project p = new ProjectMech();
		
		System.out.println(p.branch());
		System.out.println(p.projectName());
		System.out.println(p.duration());
		
	}

}
