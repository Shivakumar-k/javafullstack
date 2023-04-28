package com.xworkz.collection.boot;

import com.xworkz.collection.Player;
import com.xworkz.collection.PlayerUtil;

public class PlayerRunner {

	public static void main(String[] args) {
		Player player = (arg,arg1) -> {
			System.out.println("running play method explicitly : " + arg.toUpperCase());
			return arg.toUpperCase();
		};

		PlayerUtil.test(player);
		
		Player player1 = (arg,arg1) -> {
			System.out.println("running play method explicitly : " + arg.toLowerCase());
			return arg.toUpperCase();
		};

		PlayerUtil.test(player1);
		
		Player player2 = (arg,arg1) -> {
			System.out.println("running play method explicitly : " + arg+"  "+arg1);
			return arg+arg1;
		};

		PlayerUtil.test(player2);

	}

}
