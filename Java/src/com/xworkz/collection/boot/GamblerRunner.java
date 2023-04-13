package com.xworkz.collection.boot;

import com.xworkz.collection.Gambler;
import com.xworkz.collection.GamblerUtil;


public class GamblerRunner {

	public static void main(String[] args) {
		Gambler gamble = (arg) -> {
			System.out.println("running participate method explicitly : " + arg);
			if(arg<500 && arg<1000) {
				return 0.0d;
			}else if(arg>1000) {
				return 100.0d;
			}
			return arg;
			
			
		};

		GamblerUtil.test(gamble);
//		GamblerUtil.test(gamble);
		
		

	}

}
