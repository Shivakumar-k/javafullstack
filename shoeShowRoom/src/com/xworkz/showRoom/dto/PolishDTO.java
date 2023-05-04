package com.xworkz.showRoom.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PolishDTO implements Serializable,Comparable<PolishDTO> {
	@NotNull
	@NotEmpty
	@Size(min = 3, max=20, message="brand name should be in between 3 and 20 chars")
	private String brand;
	@NotNull
	@NotEmpty
	@Size(min = 3, max=20, message="type should be in between 3 and 20 chars")
	private String type;
	@Min(value = 10, message="price should be greater than 10" )
	private double price;
	@Min(value = 10, message="quantity should be greater than 10" )
	private int quantity;
	@Override
	public int compareTo(PolishDTO o) {
		
		return 0;
	}
	

}
