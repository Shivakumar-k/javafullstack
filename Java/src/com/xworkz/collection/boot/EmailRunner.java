package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class EmailRunner {

	public static void main(String[] args) {
		Collection<String> email = new ArrayList<>();
		email.add("Shiva@gmail.com");
		email.add("sunil@gmail.com");
		email.add("sagar@gmail.com");
		email.add("ranjit@gmail.com");
		email.add("muthu@gmail.com");
		email.add("dinesh@yahoo.com");
		email.add("mohan@yahoo.com");
		email.add("Ashok@yahoo.com");
		email.add("dinakar@yahoo.com");
		email.add("jayanth@yahoo.com");
		email.add("Madhu@outlook.com");
		email.add("vinod@outlook.com");
		email.add("Sharana@outlook.com");
		email.add("abhi@outlook.com");
		email.add("raj@outlook.com");
		email.add("ram@xworkz.com");
		email.add("tom@xworkz.com");
		email.add("kumar@xworkz.com");
		email.add("vinay@xworkz.com");
		email.add("matreyem@xworkz.com");
		email.add("astik@xworkz.com");
		email.add("raghu@xworkz.com");
		email.add("virat@xworkz.com");
		email.add("rohit@xworkz.com");
		email.add("surya@xworkz.com");

		System.out.println("---------All emails in uppercase--------------");

		email.stream().map(ref -> ref.toUpperCase()).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		System.out.println("---------All mails in gmail domain--------------");

		email.stream().filter(ref -> ref.endsWith("@gmail.com")).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		System.out.println("---------All mails in yahoo domain--------------");

		email.stream().filter(ref -> ref.endsWith("@yahoo.com")).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		System.out.println("---------All mails in outlook domain--------------");

		email.stream().filter(ref -> ref.endsWith("@outlook.com")).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

		System.out.println("---------All mails in xworkz domain--------------");

		email.stream().filter(ref -> ref.endsWith("@xworkz.com")).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

		System.out.println("---------All mails not in gmail & xworkz domain--------------");

		email.stream().filter(ref -> !ref.endsWith("@gmail.com") && !ref.endsWith("@xworkz.com"))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		
		System.out.println("---------All unique domain names--------------");
		
		email.stream().map(ref -> ref.split("@")).map(ref->ref[1]).distinct().collect(Collectors.toList())
		.forEach(ref -> System.out.println(ref));
				
		
		

	}

}
