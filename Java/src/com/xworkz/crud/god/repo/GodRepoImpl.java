package com.xworkz.crud.god.repo;

import com.xworkz.crud.god.GodDTO;

public class GodRepoImpl implements GodRepo {

	private GodDTO[] god = new GodDTO[4];
	private int godIndex = 0;

	@Override
	public boolean save(GodDTO dto) {
		if (this.godIndex < this.god.length) {
			god[godIndex] = dto;
			System.out.println("saving is correct");
			godIndex++;
			return true;
		} else {
			System.out.println("Saving is incorrect");
		}

		return false;
	}

	@Override
	public GodDTO find(GodDTO dto) {
		for (int godIndex = 0; godIndex < this.god.length; godIndex++) {
			GodDTO ref = this.god[godIndex];
			if (ref.equals(dto)) {
				System.out.println("dto is found");
				return ref;
			}
		}
		return null;
	}

	@Override
	public GodDTO findByName(String name) {
		for (int godIndex = 0; godIndex < this.god.length; godIndex++) {
			GodDTO ref = this.god[godIndex];
			if (ref.getName().equals(name)) {
				System.out.println("dto is found for name");
				return ref;
			}
		}

		return null;
	}

	@Override
	public String findFestvalByNameAndReligion(String name, String religion) {
		for (int godIndex = 0; godIndex < this.god.length; godIndex++) {
			GodDTO ref = this.god[godIndex];
			if (ref.getName().equals(name) && ref.getReligion().equals(religion)) {
				System.out.println("Festival  is found for name and religion");
				return ref.getFestival();
			}
		}

		return null;
	}

	@Override
	public int findHolidaysByNameByReligionByFestival(String name, String religion, String festival) {
		for (int godIndex = 0; godIndex < this.god.length; godIndex++) {
			GodDTO ref = this.god[godIndex];
			if (ref.getName().equals(name) && ref.getReligion().equals(religion)
					&& ref.getFestival().equals(festival)) {
				System.out.println("no of holidays  is found for name, religion and festival");
				return ref.getNoOfholidays();
			}
		}

		return 0;
	}

	@Override
	public int total() {

		return this.godIndex;
	}

}
