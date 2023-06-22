package com.xworkz.studentJpa.boot;

import java.util.List;

import com.xworkz.studentJpa.entity.StudentEntity;
import com.xworkz.studentJpa.repo.StudentRepository;
import com.xworkz.studentJpa.service.StudentService;

public class StudentJpaRunner {

	public static void main(String[] args) {

		System.out.println("Running main method in jpa runner");

		StudentEntity entity = new StudentEntity();

		entity.setId(2);
		entity.setName("tommy");
		entity.setAge(21);

		StudentRepository repository = new StudentRepository();

		StudentService service = new StudentService(repository);

		service.validateAndSave(entity);
		List<StudentEntity> list = service.findAll();
		for (StudentEntity studentEntity : list) {
			System.out.println(studentEntity);
		}

		// System.out.println(service.findAll());
	}
}
