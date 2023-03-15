package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.constants.WeaponType;
import com.xworkz.application.dto.WeaponDTO;

public class WeaponImpl implements WeaponService {

	@Override
	public boolean validateAndSave(WeaponDTO dto) {

		if (dto != null) {

			int id = dto.getId();
			String name = dto.getName();
			WeaponType type = dto.getWeapon();
			double cost = dto.getCost();
			String material = dto.getMaterial();
			String madeBy = dto.getMadeBy();
			String manufacturedBy = dto.getManufacturedBy();
			LocalDate manYear = dto.getManufacturedYear();
			String usedBy = dto.getUsedBy();
			String usedFor = dto.getUsedFor();
			double weight = dto.getWeight();

			boolean validId = false;
			boolean validName = false;
			boolean validType = false;
			boolean validCost = false;
			boolean validMaterial = false;
			boolean validMadeBy = false;
			boolean validManufacturedBy = false;
			boolean validManYear = false;
			boolean validUsedBy = false;
			boolean validUsedFor = false;
			boolean validWeight = false;
			boolean validation = false;

			if (id > 0) {
				System.out.println("Valid Id");
				validId = true;
			} else {
				System.err.println("Inavalid Id");
				return false;
			}

			if (name != null && name.length() > 1 && name.length() < 30) {
				System.out.println("Valid Name");
				validName = true;
			} else {
				System.err.println("Invalid Name");
				return false;
			}

			if (type != null) {
				System.out.println("Type is valid");
				validType = true;
			} else {
				System.err.println("Inavalid Type");
				return false;
			}
			if (cost > 100 && cost < 100000) {
				System.out.println("Valid Cost");
				validCost = true;
			} else {
				System.err.println("Invalid Cost");
				return false;
			}
			if (material != null && material.length() > 1 && material.length() < 30) {
				System.out.println("Valid Material");
				validMaterial = true;
			} else {
				System.err.println("Invalid material");
				return false;
			}
			if (madeBy != null && madeBy.length() > 1 && madeBy.length() < 30) {
				System.out.println("Valid Made by");
				validMadeBy = true;
			} else {
				System.err.println("Invalid Made by ");
				return false;
			}
			if (manufacturedBy != null && manufacturedBy.length() > 1 && manufacturedBy.length() < 30) {
				System.out.println("Valid manufactured by");
				validManufacturedBy = true;
			} else {
				System.err.println("Invalid manufactured by ");
				return false;
			}
			LocalDate year = LocalDate.now().plusDays(1);
			LocalDate year1 = LocalDate.of(1960, 1, 1);
			if (manYear.isBefore(year) && manYear.isAfter(year1)) {
				System.out.println("Valid Year");
				validManYear = true;
			} else {
				System.err.println("Invalid Year");
				return false;
			}
			if (usedBy != null && usedBy.length() > 1 && usedBy.length() < 30) {
				System.out.println("Valid used By");
				validUsedBy = true;
			} else {
				System.err.println("Invalid used By");
				return false;
			}
			if (usedFor != null && usedFor.length() > 1 && usedFor.length() < 30) {
				System.out.println("Valid used For");
				validUsedFor = true;
			} else {
				System.err.println("Invalid used For");
				return false;
			}

			if (weight > 250 && weight < 1000) {
				System.out.println("Valid Weaight");
				validWeight = true;
			} else {
				System.err.println("Invalid weight");
				return false;
			}
			if (validId && validName && validType && validCost && validMaterial && validMadeBy && validManufacturedBy
					&& validManYear && validUsedBy && validUsedFor && validWeight) {
				System.out.println("DTO is Validation done");
				validation = true;
			} else {
				System.err.println("DTO validation not done");
				return false;
			}

		} else {
			System.err.println("dto is invalid");
		}

		return true;
	}

}
