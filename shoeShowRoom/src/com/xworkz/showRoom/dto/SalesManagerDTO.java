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
@AllArgsConstructor
public class SalesManagerDTO implements Serializable, Comparable<SalesManagerDTO> {
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 20)
	private String name;
	@Min(value = 0)
	private int age;
	@Min(value = 40000)
	private double salary;
	@Min(value = 40000)
	private long mobileNo;

	@Override
	public int compareTo(SalesManagerDTO o) {
		
		return this.age- o.age;
	}

}
