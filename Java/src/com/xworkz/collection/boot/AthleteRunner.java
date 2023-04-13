package com.xworkz.collection.boot;

import com.xworkz.collection.Athlete;
import com.xworkz.collection.AthleteUtil;

public class AthleteRunner {

	public static void main(String[] args) {
		Athlete athlete = (arg) -> {
			System.out.println("running participate method explicitly : " + arg);
		};

		AthleteUtil.test(athlete);

		AthleteUtil.test((arg) -> {
			System.out.println("running participate method implicitly : " + arg);
		});

	}

}
