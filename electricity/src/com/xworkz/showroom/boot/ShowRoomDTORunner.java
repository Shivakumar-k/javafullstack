package com.xworkz.showroom.boot;

import java.time.LocalDate;



import com.xworkz.showroom.dto.ShowRoomDTO;
import com.xworkz.showroom.repo.ShowRoomRepo;
import com.xworkz.showroom.repo.ShowRoomRepoImpl;
import com.xworkz.showroom.service.ShowRoomService;
import com.xworkz.showroom.service.ShowRoomServiceImpl;

public class ShowRoomDTORunner {

	public static void main(String[] args) {
		ShowRoomRepo repo = new ShowRoomRepoImpl();
		ShowRoomService  service = new ShowRoomServiceImpl(repo); 
		
		ShowRoomDTO dto1 = new ShowRoomDTO(1, "Hyndai", "banglore", 9368745612l,LocalDate.of(2018, 10, 15)  , false);
		boolean save1=service.validateAndSave(dto1);
		System.out.println("DTO1 is saved:"+save1);
		
		ShowRoomDTO dto2 = new ShowRoomDTO(3, "Honda", "Davangere", 6855745612l,LocalDate.of(2022, 2, 8)  , false);
		boolean save2=service.validateAndSave(dto2);
		System.out.println("DTO2 is saved:"+save2);
		
		

	}

}
