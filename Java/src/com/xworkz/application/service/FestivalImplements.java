package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.constants.Sweet;
import com.xworkz.application.dto.FestivalDTO;

public class FestivalImplements implements FestivalService {

	@Override
	public boolean validateAndSave(FestivalDTO dto) {
		System.out.println("validateAndThenSave method runninng...: "+dto);
		if(dto !=null) {
			String name = dto.getName();
			Sweet sweetname = dto.getSweetName();
			String godName = dto.getGodName();
			LocalDate startDate=dto.getStartDate();
			LocalDate endDate=dto.getEndDate();
			
		}
		return false;
	}

}
