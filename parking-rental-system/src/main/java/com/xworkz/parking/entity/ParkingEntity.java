package com.xworkz.parking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@NamedQuery(name = "findAll", query = "select info from ParkingEntity as info")
@Table(name = "admin")
public class ParkingEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "loginTime")
	private String loginTime;
	@Column(name = "createdBy")
	private String createdBy;
	@Column(name = "UpdatedBy")
	private String UpdatedBy;
	@Column(name = "createdDate")
	private String createdDate;
	@Column(name = "updatedDate")
	private String updatedDate;
}
