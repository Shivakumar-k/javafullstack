package com.xworkz.form.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="formp")
public class FormEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="f_id")
	private int id;
	@Column(name="f_name")
	private String name;
	@Column(name="f_email")
	private String email;
	@Column(name="f_age")
	private int age;
	@Column(name="f_city")
	private String city;


}
