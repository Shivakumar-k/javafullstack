package com.xworkz.application.repositary;

import java.util.Iterator;

import com.xworkz.application.dto.AddressDTO;

public class AddressRepoImplements implements AddressRepo{
	
	private AddressDTO[] addresses = new AddressDTO[5];
	private int addressIndex = 0;

	@Override
	public boolean save(AddressDTO repo) {
		if(this.addressIndex<this.addresses.length) {
			addresses[addressIndex]=repo;
			this.addressIndex++;
			System.out.println("Saving is correct");
			return true;
		}
		else {
			System.out.println("memory is full, we cannot save");
		}
		
		return false;
	}

	@Override
	public boolean isExist(AddressDTO repo) {
		if(addressIndex==0) {
			System.out.println("first element does not exist so we cannot check");
			return false;
		}
		else {
			System.out.println("First element exist we can check");
			
			for (int addressIndex = 0; addressIndex < addresses.length; addressIndex++) {
				AddressDTO ref = this.addresses[addressIndex];
				if(ref.equals(repo)) {
					System.out.println("repo exists");
					return true;
				}else {
					System.out.println("repo does not exist");
				}
				
			}
		}
		return false;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AddressDTO findByNumber(int number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean find(AddressDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AddressDTO findByStreet(String street) {
		// TODO Auto-generated method stub
		return null;
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
