package com.xworkz.crud.stadium.service;

import static com.xworkz.crud.animal.validation.AnimalValidation.*;

import com.xworkz.crud.animal.validation.AnimalValidation;
import com.xworkz.crud.stadium.StadiumDTO;
import com.xworkz.crud.stadium.repo.StadiumRepo;

public class StadiumServiceImpl implements StadiumService {

	private StadiumRepo repo;

	public StadiumServiceImpl(StadiumRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(StadiumDTO dto) {
		System.out.println("running validate and save ");
		if (dto != null) {
			System.out.println("dto is not null we can validate");

			String name = dto.getName();
			String stateName = dto.getStateName();
			int capacity = dto.getCapacity();
			double ticketPrice = dto.getTicketPrice();

			boolean validName = false;
			boolean validState = false;
			boolean validCapacity = false;
			boolean validticketprice = false;

			if (validString(name)) {
				System.out.println("valid name");
				validName = true;
			} else {
				System.out.println("invalid name");
			}
			if (AnimalValidation.validString(stateName)) {
				System.out.println("valid state");
				validState = true;
			} else {
				System.out.println("invalid state");
			}
			if (AnimalValidation.validInt(capacity)) {
				System.out.println("valid capacity");
				validCapacity = true;
			} else {
				System.out.println("invalid capacity");
			}

			if (AnimalValidation.validDouble(ticketPrice)) {
				System.out.println("valid price");
				validticketprice = true;
			} else {
				System.out.println("invalid price");
			}

			if (AnimalValidation.validFlag(validName, validState, validCapacity, validticketprice)) {
				System.out.println("valid data , we can save");
				boolean save = this.repo.save(dto);
				return true;
			} else {
				System.out.println("invalid data we cannot save the data");
			}
		}

		else {
			System.out.println("dto is null we cannot validate");
		}

		return false;
	}

	@Override
	public StadiumDTO find(StadiumDTO dto) {
		if (dto != null) {
			return this.repo.find(dto);
		}

		return null;
	}

	@Override
	public StadiumDTO findByName(String name) {
		if (validString(name)) {
			return this.repo.findByName(name);
		}
		return null;

	}

	@Override
	public int findCapacityByName(String name) {
		if (validString(name)) {
			return this.repo.findCapacityByName(name);
		}
		return 0;
	}

	@Override
	public double findTicketByNameAndCapacity(String name, int capacity) {
		if (validString(name) && validInt(capacity)) {
			return this.repo.findTicketByNameAndCapacity(name, capacity);
		}
		return 0;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return this.repo.total();
	}

}
