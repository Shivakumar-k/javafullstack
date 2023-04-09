package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.repositary.EducationRepository;
import com.xworkz.application.util.EducationValidation;


public class EducationServiceImpl implements EducationService {

	private EducationRepository repo;

	public EducationServiceImpl(EducationRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(EducationDTO dto) {
		System.out.println("Running validateAndSave Method");
		if (dto != null) {
			System.out.println("dto is not null,we can validate");

			int id = dto.getId();
			String name = dto.getName();
			String degreeName = dto.getDegreeName();
			double percentage = dto.getPercentage();
			String university = dto.getUniversity();
			LocalDate startDate = dto.getStartDate();
			LocalDate endDate = dto.getEndDate();
			boolean backlog = dto.getBacklog();
			String stream = dto.getStream();

			boolean validId = false;
			boolean validName = false;
			boolean validDegreeName = false;
			boolean validPercentage = false;
			boolean validUniversity = false;
			boolean validStartDate = false;
			boolean validEndDate = false;
			boolean validBacklog = false;
			boolean validStream = false;

			if (EducationValidation.validInt(id)) {
				System.out.println("Valid id");
				validId = true;
			} else {
				System.out.println("invalid id");
			}
			if (EducationValidation.validString(name)) {
				System.out.println("Valid name");
				validName = true;
			} else {
				System.out.println("invalid name");
			}
			if (EducationValidation.validString(degreeName)) {
				System.out.println("valid DegreeName");
				validDegreeName = true;
			} else {
				System.out.println("invalid degreeName");
			}
			if (EducationValidation.validDouble(percentage)) {
				System.out.println("valid Percentage");
				validPercentage = true;
			} else {
				System.out.println("invalid persentage");
			}
			if (EducationValidation.validString(university)) {
				System.out.println("valid university");
				validUniversity = true;
			} else {
				System.out.println("invalid university");
			}

			if (EducationValidation.validDate(startDate)) {
				System.out.println("valid startDate");
				validStartDate = true;
			} else {
				System.out.println("invalid startDate");
			}
			if (EducationValidation.validDate(endDate)) {
				System.out.println("valid endDate");
				validEndDate = true;
			} else {
				System.out.println("invalid endDate");
			}
			if (EducationValidation.validBoolean(backlog)) {
				System.out.println("Valid backlog");
				validBacklog = true;
			} else {
				System.out.println("invalid backlog");
			}
			if (EducationValidation.validString(stream)) {
				System.out.println("Valid stream");
				validStream = true;
			} else {
				System.out.println("invalid stream");
			}

			if (EducationValidation.validFlag(validId, validName, validDegreeName, validPercentage, validUniversity, validStartDate,
					validEndDate, validBacklog, validStream)) {
				System.out.println("data are valid we can save the data");
				boolean exist = this.repo.isExist(dto);
				if(!exist){
					
					boolean save = this.repo.save(dto);
					return save;
				}
				
				return true;
			} else {
				System.err.println("data are invalid we cannot save the data");
			}
		} else {
			System.err.println("DTO is null");
		}
		return false;
	}

	@Override
	public boolean isExist(EducationDTO dto) {
		
		return false;
	}

	@Override
	public EducationDTO findByCandidateName(String name) {
		if (EducationValidation.validString(name)) {
			return this.repo.findByCandidateName(name);
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateNameAndUniversity(String name, String university) {
		if (EducationValidation.validString(name) && EducationValidation.validString(university)) {
			return this.repo.findByCandidateNameAndUniversity(name, university);
		}
		return null;
	}

	@Override
	public boolean findBacklogByCandidateNameAndDegreeNameAndUniversity(String name, String degree, String university) {
		if (EducationValidation.validString(name) && EducationValidation.validString(degree) && EducationValidation.validString(university)) {
			return this.repo.findBacklogByCandidateNameAndDegreeNameAndUniversity(name, degree, university);
		}
		return false;
	}

	@Override
	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String name, LocalDate startDate, LocalDate endDate) {
		if (EducationValidation.validString(name) && EducationValidation.validDate(startDate) && EducationValidation.validDate(endDate)) {
			return this.repo.findByCandidateNameAndStartDateAndEndDate(name, startDate, endDate);
		}
		return null;
	}

	@Override
	public double findPercentageByCandidateName(String name) {
		if (EducationValidation.validString(name)) {
			return this.repo.findPercentageByCandidateName(name);
		}
		return 0;
	}

	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUniversity(String name, String degree, String university) {
		if (EducationValidation.validString(name) && EducationValidation.validString(degree) && EducationValidation.validString(university)) {
			return this.repo.findStreamByCandidateNameAndDegreeNameAndUniversity(name, degree, university);
		}
		return null;
	}

	@Override
	public int findidByCandidateNameAndDegreeNameAndUniversity(String name, String degree, String university) {
		if (EducationValidation.validString(name) && EducationValidation.validString(degree) && EducationValidation.validString(university)) {
			return this.repo.findidByCandidateNameAndDegreeNameAndUniversity(name, degree, university);
		}
		return 0;
	}

	@Override
	public String findUniversityByCandidateName(String name) {
		if (EducationValidation.validString(name)) {
			return this.repo.findUniversityByCandidateName(name);
		}
		return null;
	}

	@Override
	public int total() {

		return this.repo.total();
	}

}
