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
	@Size(min = 3, max=20)
	private String brand;
	@NotNull
	@NotEmpty
	@Size(min = 3, max=20)
	private String type;
	@Min(value = 10)
	private double price;
	@Min(value = 10)
	private int quantity;
	@Override
	public int compareTo(PolishDTO o) {
		return 0;
	}
	

}
