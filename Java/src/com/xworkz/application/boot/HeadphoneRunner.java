package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.constants.Brand;
import com.xworkz.application.constants.Color;
import com.xworkz.application.constants.TypeAndWeight;
import com.xworkz.application.dto.HeadphoneDTO;
import com.xworkz.application.service.HeadphoneImplements;
import com.xworkz.application.service.HeadphoneService;

public class HeadphoneRunner {

	public static void main(String[] args) {
		HeadphoneDTO headphoneDTO = new HeadphoneDTO(Brand.BOAT, Color.WHITE, TypeAndWeight.WIRELESS, "Rockerzz",
				"Shiva", 2727, 1, 26556d, true, LocalDate.of(2020, 3, 15));
		System.out.println(headphoneDTO);
		System.out.println("Headphone Type is: " + TypeAndWeight.WIRELESS + " And Weight is:"
				+ TypeAndWeight.WIRELESS.getWeight());

		HeadphoneService headphoneService = new HeadphoneImplements();
		boolean validate = headphoneService.validateAndSave(headphoneDTO);
		System.out.println("validate :" + validate);

	}

}
