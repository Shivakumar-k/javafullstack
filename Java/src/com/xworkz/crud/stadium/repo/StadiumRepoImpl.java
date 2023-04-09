package com.xworkz.crud.stadium.repo;

import com.xworkz.crud.stadium.StadiumDTO;

public class StadiumRepoImpl implements StadiumRepo {

	private StadiumDTO[] stadium = new StadiumDTO[4];
	private int stadiumIndex = 0;

	@Override
	public boolean save(StadiumDTO dto) {
		if (this.stadiumIndex < this.stadium.length) {
			stadium[stadiumIndex]=dto;
			System.out.println("saving correct");
			stadiumIndex++;
			return true;
		} else {
			System.out.println("saving is incorrect");
		}
		return false;
	}

	@Override
	public StadiumDTO find(StadiumDTO dto) {
		for (int stadiumIndex = 0; stadiumIndex < this.stadium.length; stadiumIndex++) {
			StadiumDTO ref = stadium[stadiumIndex];
			if (ref.equals(dto)) {
				System.out.println("dto is found");
				return ref;
			}
		}
		return null;
	}

	@Override
	public StadiumDTO findByName(String name) {
		for (int stadiumIndex = 0; stadiumIndex < this.stadium.length; stadiumIndex++) {
			StadiumDTO ref = stadium[stadiumIndex];
			if (ref.getName().equals(name)) {
				System.out.println("dto is found for name");
				return ref;
			}
		}
		return null;
	}

	@Override
	public int findCapacityByName(String name) {
		for (int stadiumIndex = 0; stadiumIndex < this.stadium.length; stadiumIndex++) {
			StadiumDTO ref = stadium[stadiumIndex];

			if (ref.getName().equals(name)) {
				System.out.println("dto is found for capacity");
				return ref.getCapacity();
			}
		}
		return 0;
	}

	@Override
	public double findTicketByNameAndCapacity(String name, int capacity) {
		for (int stadiumIndex = 0; stadiumIndex < this.stadium.length; stadiumIndex++) {
			StadiumDTO ref = this.stadium[stadiumIndex];
			if (ref.getName().equals(name) && ref.getCapacity() == capacity) {
				System.out.println("dto is found for name using weight and lifespan");
				return ref.getTicketPrice();
			}
		}
		return 0;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return this.stadiumIndex;
	}

}
