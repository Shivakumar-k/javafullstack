package com.xworkz.ambulance.repo;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.ambulance.dto.AmbulanceDTO;

public class AmbulanceRepoImpl implements AmbulanceRepo {
	private Collection<AmbulanceDTO> ambulanceDTOs = new ArrayList<AmbulanceDTO>();

	@Override
	public boolean save(AmbulanceDTO dto) {

		return this.ambulanceDTOs.add(dto);
	}

}