package com.xworkz.studentJpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="student")
public class StudentEntity {
	
	@Id
	private int id;
	
	private String name;
	
	private int age;

}
