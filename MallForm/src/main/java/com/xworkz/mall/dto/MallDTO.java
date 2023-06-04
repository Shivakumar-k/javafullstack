package com.xworkz.mall.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class MallDTO implements Serializable{
	
	private String mallName;
	private String location;
	private int numStores;
	private String category;
	private String parking;
	private String rating;
	private int openingHours;
	private String name;
	private String email;
	private String feedback;

}
