package com.xworkz.application.boot;

import com.xworkz.application.dto.MarketDTO;

public class MarketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 MarketDTO market = new  MarketDTO();
		 market.setMarketName("KR market");
		 market.setLocation("Bengaluru");
		 market.setSize(2500);
		 market.setType("Veetable");
		 
		 System.out.println(market);

	}

}
