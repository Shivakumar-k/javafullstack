package com.xworkz.showRoom;

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

public class ShoeShowRoomDTO implements Serializable,Comparable<ShoeShowRoomDTO> {
	
	@Min(value = 0, message = "value should be greater than 0")
	@Max(value = 20, message = "value should be lesser than 0")
	private int id;	
	@NotNull
	@NotEmpty
	@Size(min = 3,max=20, message = "size should be less than 0 and greater than 20")
	private String name;
	@NotNull
	@NotEmpty
	@Size(min = 3,max=20, message = "size should be less than 0 and greater than 20")
	private String address;
	@NotNull
	@NotEmpty
	@Size(min = 3,max=20, message = "size should be less than 0 and greater than 20")
	private String gstNo;
	@Override
	public int compareTo(ShoeShowRoomDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
