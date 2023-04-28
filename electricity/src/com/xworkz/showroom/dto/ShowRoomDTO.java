package com.xworkz.showroom.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class ShowRoomDTO implements Serializable,Comparable<ShowRoomDTO>

{
	@Min(value=1, message="id should be grater than 1")
	@Max(value=100, message="id should be less than 100")
	private int id;
	@NotEmpty
	@NotNull
	@Size(max = 30, min = 3, message = "name should be between 2 and 30")
	private String name;
	@NotEmpty
	@NotNull
	@Size(max = 30, min = 2, message = "location should be between 2 and 30")
	private String location;
	
	@NotNull
	private long number;
	@PastOrPresent
	private LocalDate date;
	private boolean closed;
	
	
	

	@Override
	public int compareTo(ShowRoomDTO o) {
		
		return this.name.compareTo(o.name);
	}
	
	
	
	
	
	

}
