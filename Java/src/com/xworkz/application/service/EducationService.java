package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;

public interface EducationService {
	boolean validateAndSave(EducationDTO dto);

	boolean isExist(EducationDTO dto);
	EducationDTO findByCandidateName(String name);

	EducationDTO findByCandidateNameAndUniversity(String name, String university);

	boolean findBacklogByCandidateNameAndDegreeNameAndUniversity(String name, String degree, String university);

	EducationDTO findByCandidateNameAndStartDateAndEndDate(String name, LocalDate startDate, LocalDate endDate);

	double findPercentageByCandidateName(String name);

	String findStreamByCandidateNameAndDegreeNameAndUniversity(String name, String degree, String university);

	int findidByCandidateNameAndDegreeNameAndUniversity(String name, String degree, String university);

	String findUniversityByCandidateName(String name);

	int total();

}
