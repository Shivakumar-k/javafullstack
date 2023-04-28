package com.xworkz.marriage.repo;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.marriage.dto.MarriageDTO;

public class MarriageRepoImpl implements MarriageRepo{
	private Collection<MarriageDTO> marriageDTOs=new ArrayList<MarriageDTO>();
	
	public MarriageRepoImpl() {
		
	}
	@Override
	public boolean save(MarriageDTO dto) {
		
		return this.marriageDTOs.add(dto);
	}

}
