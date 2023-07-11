package com.xworkz.parking.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@NamedQuery(name = "findAll", query = "select info from ParkingEntity as info")
@NamedQuery(name="findByEmail", query = "select info from ParkingEntity as info where info.email=:byEmail")
@NamedQuery(name="updateLogingTime", query = "update ParkingEntity info set info.loginTime=:updatedTime where info.email=:byEmail")
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
	private LocalDateTime loginTime;
	@Column(name = "createdBy")
	private String createdBy;
	@Column(name = "UpdatedBy")
	private String UpdatedBy;
	@Column(name = "createdDate")
	private String createdDate;
	@Column(name = "updatedDate")
	private String updatedDate;
}
