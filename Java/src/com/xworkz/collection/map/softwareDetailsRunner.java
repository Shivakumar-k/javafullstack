package com.xworkz.collection.map;

import java.util.HashMap;
import java.util.Map;

public class softwareDetailsRunner {
public static void main(String[] args) {
		
		Map<Integer, String> softwares= new HashMap<>();
		softwares.put(1, "Microsoft office");
		softwares.put(2, "Adobe");
		softwares.put(3, "Google");
		softwares.put(4, "Mozilla");
		softwares.put(5, "Zoom");
		softwares.put(6, "Slack");
		softwares.put(7, "Spotify");
		softwares.put(8, "Phooshop");
		softwares.put(9, "AutoCaed");
		softwares.put(10, "Instagram");
		
		System.out.println(softwares);
		
		softwares.remove(4);
		softwares.remove(5, "Zoom");
		softwares.replace(3, "Google");
		System.out.println(softwares);
		
		System.out.println(softwares.keySet());
		System.out.println(softwares.values());
		System.out.println(softwares.entrySet());
		
		softwares.clear();
		System.out.println(softwares);
	}

}
