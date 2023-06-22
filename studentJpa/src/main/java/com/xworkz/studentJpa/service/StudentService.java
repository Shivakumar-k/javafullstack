package com.xworkz.studentJpa.service;

import java.util.List;

import com.xworkz.studentJpa.entity.StudentEntity;
import com.xworkz.studentJpa.repo.StudentRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StudentService {

	private StudentRepository repo;

	public boolean validateAndSave(StudentEntity entity) {
		System.out.println("Executing save method");
		return this.repo.save(entity);
	}

	public List<StudentEntity> findAll() {
		System.out.println("Executing findAll method");
		return this.repo.findAll();

	}
}
