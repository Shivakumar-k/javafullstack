package com.xworkz.showroom.repo;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.showroom.dto.ShowRoomDTO;

public class ShowRoomRepoImpl implements ShowRoomRepo {
	
	private Collection<ShowRoomDTO> showRoomDTO = new ArrayList<ShowRoomDTO>();

	@Override
	public boolean save(ShowRoomDTO dto) {
		
		return this.showRoomDTO.add(dto);
	}

}
