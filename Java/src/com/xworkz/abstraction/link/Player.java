package com.xworkz.abstraction.link;

public class Player implements CricketRule {
	
	
	public Player() {
		System.out.println("no-arg const");
	}
	

	@Override
	public String coach() {
		// TODO Auto-generated method stub
		return "atleast one coach";
	}

	@Override
	public int numOfPlayers() {
		// TODO Auto-generated method stub
		return 11;
	}

}
