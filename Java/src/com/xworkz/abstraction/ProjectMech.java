package com.xworkz.abstraction;

public class ProjectMech extends Project {

	@Override
	public String projectName() {
	
		return "Composite Material";
	}

	@Override
	public String branch() {
	
		return "Mechanical";
	}

	@Override
	public int duration() {
		
		return 10;
	}

}
