package com.xworkz.application.boot;

import com.xworkz.application.dto.AttendanceDTO;

public class AttendanceRunner {

	public static void main(String[] args) {
		
		AttendanceDTO attendance = new AttendanceDTO();
		attendance.setSection("X-Workz");
		attendance.setBoys(13);
		attendance.setGirls(10);
		attendance.setTotalStudents(23);
		attendance.setAllPresent(true);
		
		
		System.out.println(attendance);
		System.out.println(attendance.hashCode());
	

	}

}
