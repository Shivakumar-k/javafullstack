package com.xworkz.application.repositary;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;

public class EducationRepositoryImpl implements EducationRepository {

	private EducationDTO[] education = new EducationDTO[20];
	private int educationIndex = 0;

	@Override
	public boolean save(EducationDTO dto) {
		if (this.educationIndex < this.education.length) {
			education[educationIndex] = dto;
			System.out.println("saving is correct");
			return true;
		} else {
			System.err.println("memory is full,saving is not correct");
		}
		return false;
	}

	@Override
	public boolean isExist(EducationDTO dto) {
		if (educationIndex == 0) {
			System.out.println("first element is not found");
			return false;
		} else {
			System.out.println("first element is exist");
			for (int educationIndex = 0; educationIndex < education.length; educationIndex++) {
				EducationDTO ref = this.education[educationIndex];
				if (ref.equals(dto)) {
					System.out.println("dto is exist");
					return true;
				} else {
					System.err.println("dto is not exist");
				}
			}
		}
		return false;
	}

	@Override
	public EducationDTO findByCandidateName(String name) {
		for (int educationIndex = 0; educationIndex < education.length; educationIndex++) {
			EducationDTO ref = this.education[educationIndex];
			if (ref.getName() == name) {
				System.out.println("dto is found for candidateName");
				return ref;
			} else {
				System.err.println("dto is notfound for candidateName");
			}
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateNameAndUniversity(String name, String university) {
		for (int educationIndex = 0; educationIndex < education.length; educationIndex++) {
			EducationDTO ref = this.education[educationIndex];
			if (ref.getName() == name && ref.getUniversity() == university) {
				System.out.println("dto is found for name,university");
				return ref;
			} else {
				System.err.println("dto is notfound for name,university");
			}
		}
		return null;
	}

	@Override
	public boolean findBacklogByCandidateNameAndDegreeNameAndUniversity(String name, String degree, String university) {
		for (int educationIndex = 0; educationIndex < education.length; educationIndex++) {
			EducationDTO ref = this.education[educationIndex];
			if (ref.getName().equals(name) && ref.getDegreeName().equals(degree)
					&& ref.getUniversity().equals(university)) {
				System.out.println("dto is found for name and degree");
				return ref.getBacklog();
			} else {
				System.err.println("dto is notfound for name and degree");
			}
		}
		return false;
	}

	@Override
	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String name, LocalDate startDate, LocalDate endDate) {
		for (int educationIndex = 0; educationIndex < education.length; educationIndex++) {
			EducationDTO ref = this.education[educationIndex];
			if (ref.getName() == name && ref.getStartDate() == startDate && ref.getEndDate() == endDate) {
				System.out.println("dto is found for name and startdate and enddate");
				return ref;
			} else {
				System.err.println("dto is notfound for name and startdate and enddate");
			}
		}

		return null;
	}

	@Override
	public double findPercentageByCandidateName(String name) {
		for (int educationIndex = 0; educationIndex < education.length; educationIndex++) {
			EducationDTO ref = this.education[educationIndex];
			if (ref.getName() == name) {
				System.out.println("Percentage is found for candidateName");
				return ref.getPercentage();
			} else {
				System.err.println("Percentage is notfound for candidateName");
			}
		}
		return 0;
	}

	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUniversity(String name, String degree, String university) {
		for (int educationIndex = 0; educationIndex < education.length; educationIndex++) {
			EducationDTO ref = this.education[educationIndex];
			if (ref.getName() == name && ref.getDegreeName() == degree && ref.getUniversity() == university) {
				System.out.println("id is found for candidateName,degree,university");
				return ref.getStream();
			} else {
				System.err.println("id is notfound for candidateName,degree,university");
			}
		}
		return null;
	}

	@Override
	public int findidByCandidateNameAndDegreeNameAndUniversity(String name, String degree, String university) {
		for (int educationIndex = 0; educationIndex < this.education.length; educationIndex++) {
			EducationDTO ref = this.education[educationIndex];
			if (ref.getName().equals(name) && ref.getDegreeName().equals(degree)
					&& ref.getUniversity().equals(university)) {
				System.out.println("id is found for candidateName,degree,university");
				return ref.getId();
			} else {
				System.err.println("id is not found for candidateName,degree,university");
			}
		}
		return 0;
	}

	@Override
	public String findUniversityByCandidateName(String name) {
		for (int educationIndex = 0; educationIndex < education.length; educationIndex++) {
			EducationDTO ref = this.education[educationIndex];
			if (ref.getName() == name) {
				System.out.println("University is found for candidateName");
				return ref.getUniversity();
			} else {
				System.err.println("University is notfound for candidateName");
			}
		}
		return null;
	}

	@Override
	public int total() {

		return this.educationIndex;
	}

}
