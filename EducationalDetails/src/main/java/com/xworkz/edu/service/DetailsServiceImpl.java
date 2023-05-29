package com.xworkz.edu.service;

import com.xworkz.edu.dto.DetailsDTO;
import com.xworkz.edu.repo.DetailsRepo;
import com.xworkz.edu.repo.DetailsRepoImpl;
import com.xworkz.edu.util.ValidUtil;

public class DetailsServiceImpl implements DetailsService {
	
	private DetailsRepo repo=new DetailsRepoImpl();
	
	private ValidUtil validate = new ValidUtil();

	@Override
	public boolean validateAndSave(DetailsDTO dto) throws ClassNotFoundException {
		System.out.println("running validate And Save");
		if(dto!=null) {
			System.out.println("dto is not null we can save");
			this.repo.save(dto);
		}
			else {
				System.out.println("dto is null");
				return false;
			}
		return this.repo.save(dto);

	

	}
}


