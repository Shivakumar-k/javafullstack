package com.xworkz.configure;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.configure")
public class CollectionConfigration {

		public CollectionConfigration() {
			System.out.println("no-arg constructor from CollectionConfigration");
		}
		
	@Bean
	public List<String> name(){
		List<String> list1 = new ArrayList<String>();
		list1.add("shiva");
		list1.add("Rohit");
		list1.add("Kiran");
		list1.add("Kartik");
		list1.add("shayam");
		return list1;
	}
	
	@Bean
	public List<Integer> rollNo(){
		List<Integer> list2 = new LinkedList<Integer>();
		list2.add(85);
		list2.add(89);
		list2.add(23);
		list2.add(96);
		list2.add(21);
		return list2;
	}
	
	@Bean
	public List<Float> number(){
		List<Float> list3 = new Vector<Float>();
		list3.add(13.5f);
		list3.add(454.8f);
		list3.add(785.7f);
		list3.add(383.5f);
		list3.add(297.6f);
		return list3;
	}
	@Bean
	public List<Character> character(){
		List<Character> list4 = new Stack<Character>();
		list4.add('A');
		list4.add('B');
		list4.add('C');
		list4.add('D');
		list4.add('E');
		return list4;
	}
	
	//---------------------------------------------------------------------------------------
	
	@Bean
	public Queue<String> address(){
		Queue<String> queue1 = new PriorityQueue<String>();
		queue1.add("Banglore");
		queue1.add("Ballari");
		queue1.add("Davangere");
		queue1.add("Manglore");
		queue1.add("Hassan");
		return queue1;
	}
	
	@Bean
	public Queue<Integer> id(){
		Queue<Integer> queue2 = new ArrayDeque<Integer>();
		queue2.add(14);
		queue2.add(02);
		queue2.add(05);
		queue2.add(27);
		queue2.add(06);
		return queue2;
	}
	
	//---------------------------------------------------------------------------------------------
	
	@Bean
	public Set<String> vehicleType(){
		Set<String> set1 = new HashSet<String>();
		set1.add("Bus");
		set1.add("Bike");
		set1.add("Train");
		set1.add("Car");
		set1.add("Flight");
		return set1;
	}
	
	@Bean
	public Set<Integer> vehicleNumber(){
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(1245);
		set2.add(2568);
		set2.add(14404);
		set2.add(2545);
		set2.add(789654);
		return set2;
	}
	
	@Bean
	public SortedSet<Float> floatNumber(){
		SortedSet<Float> set3 = new TreeSet<Float>();
		set3.add(12.5f);
		set3.add(5.2f);
		set3.add(6.9f);
		set3.add(39.8f);
		set3.add(40.6f);
		return set3;
	}
	
	
}



