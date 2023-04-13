package com.xworkz.collection.boot;

import com.xworkz.collection.Shooter;
import com.xworkz.collection.ShooterUtil;

public class ShooterRunner {

	public static void main(String[] args) {
		Shooter shoot=(arg1)->{
			System.out.println("GunType is:"+arg1);
			return true;
		};
		
		System.out.println("returned:"+ShooterUtil.test(shoot));

	}

}
