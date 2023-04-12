package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class IPLFranchise {

	public static void main(String[] args) {
		Collection <String> ipl= new ArrayList<String>();
		ipl.add("Mumbai Indians");
		ipl.add("Gujarat titans");
		ipl.add("CSK");
		
		System.out.println(ipl);
		
		Collection<String> champs = new ArrayList<String>();
		champs.add("Mumbai Indians");
		champs.add("Gujarat titans");
		champs.add("CSK");
		
		
		boolean check = ipl.equals(champs);
		System.out.println(check);
		
		Collection<String> teams = new ArrayList<String>();
		teams.add("RCB");
		teams.add("Delhi capitals");
		teams.add("CSK");
		
		boolean checks = champs.equals(teams);
		System.out.println(checks);
		
		System.out.println("--------------------------------------");
		Collection <String> cricket= new ArrayList<String>();
		System.out.println("Running addAll method");
		cricket.addAll(ipl);
		cricket.addAll(teams);
		System.out.println(cricket);
		
		System.out.println("--------------------------------------");
		System.out.println("Running containsAll method");
	    boolean containsAll =cricket.containsAll(teams);
	    System.out.println(containsAll);
	    System.out.println("--------------------------------------");
	    
	    System.out.println("Running retainAll method");
	    boolean retainAll =cricket.retainAll(teams);
	    System.out.println(retainAll);
	    System.out.println("--------------------------------------");
		System.out.println("Running toArray method");
	    Object[] arr = ipl.toArray();
	    System.out.println(Arrays.toString(arr));
	    
		
		
		
		

	}

}
