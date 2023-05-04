package com.xworkz.showRoom;

import java.util.ArrayList;
import java.util.Collection;

import javax.validation.Validator;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
public class ShoeRoomrRepoImpl implements ShowRoomRepo {

	private Collection<ShoeShowRoomDTO> showRoomdto = new ArrayList<ShoeShowRoomDTO>();

	public ShoeRoomrRepoImpl(Collection<ShoeShowRoomDTO> showRoomdto) {
		super();
		this.showRoomdto = showRoomdto;
	}

	public ShoeRoomrRepoImpl() {
		System.out.println("no arg const in repo impl");

	}

	@Override
	public boolean save(ShoeShowRoomDTO dto) {
		System.out.println("Saving");

		return this.showRoomdto.add(dto);
	}

}
