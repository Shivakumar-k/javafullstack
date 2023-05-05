package com.xworkz.showRoom.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showRoom.dto.SocksDTO;

import lombok.AllArgsConstructor;

@Component
public class SocksRepoImpl implements SocksRepo {

	private Collection<SocksDTO> socksdto = new ArrayList<SocksDTO>();

	public SocksRepoImpl() {
		System.out.println("no -arg const in repo impl");
	}

	@Override
	public boolean save(SocksDTO dto) {

		return this.socksdto.add(dto);
	}

}
