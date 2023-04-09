package com.xworkz.crud.stadium.boot;

import com.xworkz.crud.stadium.StadiumDTO;
import com.xworkz.crud.stadium.repo.StadiumRepo;
import com.xworkz.crud.stadium.repo.StadiumRepoImpl;
import com.xworkz.crud.stadium.service.StadiumService;
import com.xworkz.crud.stadium.service.StadiumServiceImpl;

public class StadiumDTORunner {
	public static void main(String[] args) {

		StadiumDTO stadium = new StadiumDTO("chinnaswamy", "Karnataka", 40000, 3500.00);
		StadiumDTO stadium1 = new StadiumDTO("chepauk", "tamil nadu", 45000, 3000.00);
		StadiumDTO stadium2 = new StadiumDTO("wankede", "maharastra", 56000, 4500.00);
		StadiumDTO stadium3 = new StadiumDTO("eden garden", "west bengal", 52000, 3800.00);
	    StadiumDTO stadium4 = new StadiumDTO("Narendra Modi", "Gujarat" , 90000,
		 3200.00);

		StadiumRepo stadiumRepo = new StadiumRepoImpl();
		StadiumService service = new StadiumServiceImpl(stadiumRepo);

		boolean save = service.validateAndSave(stadium);
		System.out.println(save);

		StadiumDTO save1 = service.find(stadium);
		System.out.println(save1);

		boolean save2 = service.validateAndSave(stadium1);
		System.out.println(save2);

		StadiumDTO save3 = service.find(stadium1);
		System.out.println(save3);

		StadiumDTO save4 = service.findByName("chinnaswamy");
		System.out.println(save4);

		double price = service.findTicketByNameAndCapacity("chepauk", 45000);
		System.out.println("Ticket Price: " + price);

		int capacity = service.findCapacityByName("chepauk");
		System.out.println("no. of seats avilable: " + capacity);

	}

}
