package com.xworkz.parking.entity;


import javax.persistence.Entity;

import lombok.Data;
@Entity
@Data

public class UserInfoEntity {
	
	private String name;
	private String email;
	private String mobile;

}
