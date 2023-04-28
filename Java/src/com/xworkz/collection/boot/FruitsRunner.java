package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class FruitsRunner {

	public static void main(String[] args) {
		Collection<String> fruits = new ArrayList<String>();
		fruits.add("WaterMelon");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("Musk melon");
		fruits.add("pineapple");
		fruits.add("StrawBerry");
		fruits.add("grapes");
		fruits.add("bananaa");
		fruits.add("dragon fruit");
		fruits.add("Pomegranate");
		fruits.add("Guava");
		fruits.add("mango");
		fruits.add("tomato");
		fruits.add("jackFruit");
		fruits.add("lychee");
		fruits.add("Fig");
		fruits.add("kiwi");
		fruits.add("papaya");
		fruits.add("avocado");
		fruits.add("cherry");
		fruits.add("Cranberry");
		fruits.add("Raspberry");
		fruits.add("plum");
		fruits.add("peach");
		fruits.add("tangerine");
		fruits.add("Date");
		
		
		System.out.println("---------All fruits in uppercase--------------");
		
		fruits.stream().map(ref->ref.toUpperCase()).collect(Collectors.toList()).forEach(ref->System.out.println(ref));
	System.out.println("---------------------less than 5--------------------");
		fruits.stream().filter(ref->ref.length()<5).collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		
		System.out.println("------------------greater than 5---------------");
		fruits.stream().filter(ref->ref.length()>5).collect(Collectors.toList()).forEach(ref->System.out.println(ref));
	
		System.out.println("----------greater than 10 & less than 15 --------");
		fruits.stream().filter(ref->ref.length()>10 && ref.length()<15).collect(Collectors.toList()).forEach(ref->System.out.println(ref));
	}
	

}
