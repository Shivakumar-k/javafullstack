package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import javax.print.DocFlavor.STRING;

public class Runner {
	
	//private static final LinkedList<Object> Boolean = null;
	
	public static void main(String[] args) {
		Collection <String> myList = new ArrayList<>();
		myList.add("shiva");
		myList.add("Raj");
		myList.add("ranjit");
		myList.add("sunil");
		myList.add("ram");
		myList.add("tom");
		myList.add("ashok");
		myList.add("shashank");
		myList.add("dinesh");
		
		System.out.println(myList);
		
		Collection <Integer> myList1 = new ArrayList<>();
		myList1.add(583120);
		myList1.add(582123);
		myList1.add(589632);
		myList1.add(582369);
		myList1.add(586974);
		myList1.add(523147);
		myList1.add(564987);
		myList1.add(596321);
		myList1.add(547896);
		
		System.out.println(myList1);
		
		Collection <Boolean> myList2 = new ArrayList<>();
		myList2.add(true);
		myList2.add(false);
		myList2.add(true);
		myList2.add(true);
		myList2.add(true);
		myList2.add(false);
		myList2.add(true);
		myList2.add(true);
		myList2.add(false);
		
		System.out.println(myList2);
		
		Collection <Double> myList3 = new ArrayList<>();
		myList3.add((double)452.6);
		myList3.add((double)463.2);
		myList3.add((double)852.6);
		myList3.add((double)963.2);
		myList3.add((double)45.36);
		myList3.add((double)4526.2);
		myList3.add((double)85.2);
		myList3.add((double)96.2);
		myList3.add((double)458.2);
		
		System.out.println(myList3);
		
		Collection <Long> myList4 = new ArrayList<>();
		myList4.add((long)963258741);
		myList4.add((long)693258741);
		myList4.add((long)855869321);
		myList4.add((long)963852741);
		myList4.add((long)968574123);
		myList4.add((long)452685235);
		myList4.add((long)852123456);
		myList4.add((long)962234565);
		myList4.add((long)458152582);
		
		System.out.println(myList4);
		
		Collection <Float> myList5 = new ArrayList<>();
		myList5.add((float)1452.6);
		myList5.add((float)2463.2);
		myList5.add((float)8552.6);
		myList5.add((float)9623.2);
		myList5.add((float)45.836);
		myList5.add((float)4526.52);
		myList5.add((float)85.25);
		myList5.add((float)96.2);
		myList5.add((float)458.52);
		
		System.out.println(myList5);
		
		Collection <Character> myList6 = new ArrayList<>();
		myList6.add((char)'a');
		myList6.add((char)'n');
		myList6.add((char)'k');
		myList6.add((char)'k');
		myList6.add((char)'o');
		myList6.add((char)'h');
		myList6.add((char)'p');
		myList6.add((char)'z');
		myList6.add((char)'f');
		
		System.out.println(myList6);
		
	}

}
