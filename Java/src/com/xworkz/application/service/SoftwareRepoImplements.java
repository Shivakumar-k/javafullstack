package com.xworkz.application.service;

import java.util.Iterator;

import com.xworkz.application.dto.SoftwareDTO;
import com.xworkz.application.repositary.SoftwareRepo;

public class SoftwareRepoImplements implements SoftwareRepo {

	private SoftwareDTO softwareDTOs[] = new SoftwareDTO[5];
	private int index;

	@Override
	public boolean save(SoftwareDTO dto) {
		if (index < softwareDTOs.length) {
			softwareDTOs[index] = dto;
			this.index++;
			System.out.println(" can be saved");
			return true;
		} else {
			System.out.println("connot be saved");
		}
		return false;
	}

	@Override
	public boolean isExist(SoftwareDTO dto) {
		if (index == 0) {
			System.out.println("first element doesnot exist");
			return true;

		} else {
			System.out.println("first element does exist");
			for (int index = 0; index =this.softwareDTOs.length; index++) {
				SoftwareDTO ref = this.softwareDTOs[index];
				if (ref.equals(dto)) {
					System.out.println("dto exist");
					return true;
				} else {
					System.out.println("dto doesn't exist");
				}

			}

		}
		return false;
	}

	@Override
	public int totalSave() {

		return 0;

	}

	@Override
	public SoftwareDTO findBy(int id) {
		for (int index = 0; index < this.softwareDTOs.length; index++) {
			SoftwareDTO ref = this.softwareDTOs[index];
			if (ref.getId() == id) {
				System.out.println("Dto is found");
				return ref;
			}
		}

		return SoftwareRepo.super.findBy(id);
	}

	@Override
	public SoftwareDTO findByName(String name) {
		for (int index = 0; index < this.softwareDTOs.length; index++) {
			SoftwareDTO ref = this.softwareDTOs[index];
			if (ref.getName().equals(name)) {
				System.out.println("Dto is found");
				return ref;
			}
			
		
		}

		return SoftwareRepo.super.findByName(name);
	}
	@Override
	public SoftwareDTO findByNameAndId(String name, int id) {
		for (int index = 0; index < this.softwareDTOs.length; index++) {
			SoftwareDTO ref = this.softwareDTOs[index];
			if (ref.getName().equals(name)&& ref.getId()== id) {
				System.out.println("Dto is found name and id");
				return ref;
			}
		}
		
		return SoftwareRepo.super.findByNameAndId(name, id);
	}

}

