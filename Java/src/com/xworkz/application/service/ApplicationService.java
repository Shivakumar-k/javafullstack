package com.xworkz.application.service;

import com.xworkz.application.dto.ApplicationDTO;

public interface ApplicationService{

	boolean validateAndThenSave(ApplicationDTO dto);
}
