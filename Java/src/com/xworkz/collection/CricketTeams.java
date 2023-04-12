package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;


public class CricketTeams {
	public static void main(String[] args) {
		
		Collection <String> teams = new ArrayList<>();
		teams.add("India");
		teams.add("Australia");
		teams.add("England");
		
		System.out.println("---Before Remove method----");
		System.out.println(teams);
		teams.remove("England");
		System.out.println("---After Remove method----");
		System.out.println(teams);
		
		teams.removeAll(teams);
		System.out.println("after removeAll method: ");
		System.out.println(teams);
		


	}
}
