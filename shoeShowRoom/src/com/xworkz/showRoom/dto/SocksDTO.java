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
public class SocksDTO implements Serializable,Comparable<SocksDTO>{
	@NotNull
	@NotEmpty
	@Size(min = 3, max=20)
	private String brandName;
	@NotNull
	@NotEmpty
	@Size(min = 3, max=20)
	private String color;
	@Min(value = 5)
	private int size;
	@Min(value = 100)
	private double price;
	@Override
	public int compareTo(SocksDTO o) {
		
		return 0;
	}
	

}
