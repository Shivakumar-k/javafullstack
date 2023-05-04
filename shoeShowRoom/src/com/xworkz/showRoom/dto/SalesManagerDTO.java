package com.xworkz.showRoom.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Component
@AllArgsConstructor
public class SalesManagerDTO implements Serializable, Comparable<SalesManagerDTO> {
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 20, message = "name should be in between 3 and 20 chars")
	private String name;
	@Min(value = 0, message = "age should be greater than 0")
	private int age;
	@Min(value = 40000, message = "salary should be greater than 0")
	private double salary;
	@Min(value = 40000, message = "mobileNo should be greater than 0")
	private long mobileNo;

	@Override
	public int compareTo(SalesManagerDTO o) {
		
		return this.age- o.age;
	}

}
