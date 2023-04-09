package com.xworkz.application.service;

import com.xworkz.application.dto.AddressDTO;
import com.xworkz.application.repositary.AddressRepo;
import com.xworkz.application.util.ValidationUtil;

public class AddressServiceImplements implements AddressService {
	
	private AddressRepo repo;
	
	public AddressServiceImplements(AddressRepo repo) {
		this.repo = repo;
	}
	
	@Override
	public boolean validateAndSave(AddressDTO dto) {
		System.out.println("Running validateAndThenSave Method in AddressServiceImpl");
		if (dto != null) {
			System.out.println("Dto is not null, hence we can validate");

			String street = dto.getStreet();
			String area = dto.getArea();
			int pincode = dto.getPincode();
			int floor = dto.getFloor();
			String number = dto.getNumber();
			String city = dto.getCity();
			String state = dto.getState();

			boolean validStreet = false;
			boolean validArea = false;
			boolean validPincode = false;
			boolean validFloor = false;
			boolean validNumber = false;
			boolean validCity = false;
			boolean validState = false;
			
			if(ValidationUtil.validString(street)) {
				System.out.println("Valid Street");
				validStreet = true;
				
			}else {
				System.out.println("not valid street");
			}
			if(ValidationUtil.validString(area)) {
				System.out.println("Valid area");
				validArea = true;
				
			}else {
				System.out.println("not valid area");
			}
			if(ValidationUtil.validInt(pincode)) {
				System.out.println("Valid Pincode");
				validPincode = true;
				
			}else {
				System.out.println("not valid pincode");
			}
			if(ValidationUtil.validInt(floor)) {
				System.out.println("Valid floor");
				validFloor = true;
				
			}else {
				System.out.println("not valid Floor");
			}
			if(ValidationUtil.validString(number)) {
				System.out.println("Valid number");
				validNumber = true;
				
			}else {
				System.out.println("not valid number");
			}
			
			if(ValidationUtil.validString(city)) {
				System.out.println("Valid city");
				validCity = true;
				
			}else {
				System.out.println("not valid city");
			}
			
			if(ValidationUtil.validString(state)) {
				System.out.println("Valid State");
				validState = true;
				
			}else {
				System.out.println("not valid state");
			}
			if(ValidationUtil.valigFlag(validStreet,validArea,validPincode,validFloor,validNumber,validCity,validState)){
				
				System.out.println("Data is valid we can save the data");
				boolean save = this.repo.save(dto);
				return true;
			}
			else {
				System.out.println("Data is Invalid we can't save the data");
			}

		}else {
			System.out.println("Dto is null");
		}

		return false;
	}

	@Override
	public int total() {

		return this.repo.total();
	}

	@Override
	public AddressDTO findByNumber(number) {
		if(ValidationUtil.validInt(number)) {
		return this.repo.findByNumber(number);
		}
	}

	@Override
	public boolean find(AddressDTO dto) {
		
		return false;
	}

	@Override
	public AddressDTO findByStreet(String street) {
		if(ValidationUtil.validString(street))
		return this.repo.findByStreet(street);
	}

	@Override
	public AddressDTO findByPincode(int pincode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddressDTO findByStreetAndPincodeAndArea(int pincode, String area, String street) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddressDTO findByCityAndState(String city, String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findFloorBYNumber(int number) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String findCityByNumberAndFloorAndStreetAndPincode(int number, int floor, String street, int pincode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findPincodeByNumber(int number) {
		// TODO Auto-generated method stub
		return 0;
	}

}
