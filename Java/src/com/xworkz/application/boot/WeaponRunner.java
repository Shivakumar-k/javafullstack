package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.constants.WeaponType;
import com.xworkz.application.dto.WeaponDTO;
import com.xworkz.application.service.WeaponImpl;
import com.xworkz.application.service.WeaponService;

public class WeaponRunner {

	public static void main(String[] args) {

		WeaponDTO weapon = new WeaponDTO(21, "AK47", WeaponType.GUN, 55000, "Steel", "Soviet", "Kalashnikov",
				LocalDate.of(1999, 9, 9), "Indian Army", "Security", 999);
		System.out.println(weapon);

		WeaponService weaponService = new WeaponImpl();
		boolean saved = weaponService.validateAndSave(weapon);
		System.out.println(saved);

	}

}
