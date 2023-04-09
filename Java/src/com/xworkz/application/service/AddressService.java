package com.xworkz.application.service;

import com.xworkz.application.dto.AddressDTO;

public interface AddressService {

	boolean validateAndSave(AddressDTO addressDTO);

	int total();

	AddressDTO findByNumber(int number);

	boolean find(AddressDTO dto);

	AddressDTO findByStreet(String street);

	AddressDTO findByPincode(int pincode);

	AddressDTO findByStreetAndPincodeAndArea(int pincode, String area, String street);

	AddressDTO findByCityAndState(String city, String state);

	int findFloorBYNumber(int number);

	String findCityByNumberAndFloorAndStreetAndPincode(int number, int floor, String street, int pincode);

	int findPincodeByNumber(int number);

}
