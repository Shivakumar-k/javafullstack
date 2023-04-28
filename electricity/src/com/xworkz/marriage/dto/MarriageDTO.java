package com.xworkz.marriage.dto;

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



public class MarriageDTO implements Serializable,Comparable<MarriageDTO>{
	@Min(value=1, message="value should be grater than 1")
	@Max(value=100, message="value shold be less than 100")
	private int id;
	@NotEmpty
	@NotNull
	@Size(max = 30, min = 2, message = "value should be between 2 and 30")
	private String brideName;
	@NotEmpty
	@NotNull
	@Size(max = 30, min = 2, message = "value should be between 2 and 30")
	private String groomName;
	private boolean arranged;
	@PastOrPresent
	private LocalDate date;
	@NotEmpty
	@NotNull
	@Size(max = 30, min = 2, message = "value should be between 2 and 30")
	private String hallName;
	@Min(value=1, message="value should be grater than 1")
	@Max(value=3000, message="value shold be less than 100")
	private int noOfPeopleInvited;
	private boolean dowry;

	
	@Override
	public int compareTo(MarriageDTO o) {
		
		return this.brideName.compareTo(o.brideName);
	}
	

}
