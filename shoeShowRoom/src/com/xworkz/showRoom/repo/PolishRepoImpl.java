package com.xworkz.showRoom.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showRoom.dto.PolishDTO;
@Component
public class PolishRepoImpl implements PolishRepo {
	
	private Collection<PolishDTO> polishDtos = new ArrayList<PolishDTO>();
	
	public PolishRepoImpl(Collection<PolishDTO> polishDtos) {
		super();
		this.polishDtos = polishDtos;
	}

	public PolishRepoImpl() {
		System.out.println("No arg const in repo Impl");
	}

	@Override
	public boolean save(PolishDTO dto) {
		
		return this.polishDtos.add(dto);
	}

}
