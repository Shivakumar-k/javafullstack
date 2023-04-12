package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class ExamRunner {

	public static void main(String[] args) {
		Collection <String> exam = new ArrayList<String>();
		exam.add("Turbo Machines");
		exam.add("Maths");
		exam.add("Physics");
		exam.add("Chemistry");
		exam.add("Biology");
		exam.add("CAD");
		exam.add("Java");
		exam.add("Thermodynamics");
		exam.add("Kinematics");
		exam.add(null);
	
		
		System.out.println("running for each loop");

        for (String member : exam) {

            if (Objects.nonNull(member)) {
                System.out.println(member);  
            }
        }
        System.out.println("size: " + exam.size());

        Iterator<String> examIterator = exam.iterator();
        while (examIterator.hasNext()) {
            String member = examIterator.next();
          {
                if (Objects.isNull(member)) {
                	examIterator.remove();
                    System.out.println("After remove: " + exam);
                   System.out.println("After remove size : " + exam.size());
               }
            }
        }
		

	}

}
