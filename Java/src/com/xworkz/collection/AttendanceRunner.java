package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AttendanceRunner {

	public static void main(String[] args) {
		Collection<String> attendance = new ArrayList<>();
		attendance.add("Shiva");
		attendance.add("Ranjit");
		attendance.add("Sunil");
		attendance.add("Sagar");
		attendance.add("Muthu");
		attendance.add("Dinesh");
		attendance.add("Sagar");
		attendance.add("Nikhil");
		attendance.add("Jagadish");
		attendance.add("Mohan");
		attendance.add("Madhu");

		System.out.println("running for each loop");

		for (String member : attendance) {

			if (member != null) {
				System.out.println(member);
			}
		}
		System.out.println("size: " + attendance.size());

		Iterator<String> castIterator = attendance.iterator();
		while (castIterator.hasNext()) {
			String member = castIterator.next();
			if (member != null) {
				if (member.equals("Shiva")) {
					castIterator.remove();
					System.out.println("After remove: " + attendance);
					System.out.println("After remove size : " + attendance.size());
				}
			}
		}
	}

}
