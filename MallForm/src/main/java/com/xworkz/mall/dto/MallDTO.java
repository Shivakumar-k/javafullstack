package com.xworkz.mall.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Data;
@Data
public class MallDTO implements Serializable,Comparable<MallDTO>{
	@Size(min = 3,max=20, message = "Mall Name should be in between 3 and 20")
	private String mallName;
	@Size(min = 3,max=20, message = "Location should be in between 3 and 20")
	private String location;
	@Min(value = 1, message = "stores should be greater than 0")
	@Max(value = 15, message = "stores should be lesser than 15")
	private int numStores;
	private String category;
	private String parking;
	private String rating;
	private int openingHours;
	@Size(min = 3,max=20, message = "name should be in between 3 and 20")
	private String name;
	@Size(min = 3,max=20, message = "email should be in between 3 and 20")
	private String email;
	@Size(min = 5,max=200, message = "feedback should be in between 3 and 20")
	private String feedback;
	
	private String originalFileName;
	
	private String fileName;
	private String contentType;
	private long fileSize;
	@Override
	public int compareTo(MallDTO o) {
	
		return this.getMallName().compareTo(o.getMallName());
	}
	
	
	}


