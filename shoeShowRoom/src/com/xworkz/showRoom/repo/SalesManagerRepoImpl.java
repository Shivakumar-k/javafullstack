package com.xworkz.showRoom.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showRoom.dto.SalesManagerDTO;

@Component
public class SalesManagerRepoImpl implements SalesManagerRepo {

	private Collection<SalesManagerDTO> salesManagerdto = new ArrayList<SalesManagerDTO>();

	public SalesManagerRepoImpl() {
		System.out.println("no - arg constr in repo impl");
	}

	@Override
	public boolean save(SalesManagerDTO dto) {

		return this.salesManagerdto.add(dto);
	}

}
