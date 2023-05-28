package com.xworkz.edu.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DetailsDTO {
	@NotEmpty
	@NotEmpty
	@Size(min =3, max = 20, message= "size should between 3 and 20 chars" )
	private String name;
	@NotEmpty
	@NotEmpty
	@Size(min =3, max = 20, message= "size should between 3 and 20 chars")
	private String qualification;
	@NotEmpty
	@NotEmpty
	@Size(min =3, max = 20, message= "size should between 3 and 20 chars")
	private String stream;
	@NotEmpty
	@NotEmpty
	@Size(min =3, max = 20, message= "size should between 3 and 20 chars")
	private String university;
	@NotEmpty
	@NotEmpty
	@Size(min =3, max = 20, message= "size should between 3 and 20 chars")
	private String collage;
	@NotEmpty
	@NotEmpty
	@Size(min =3, max = 20, message= "size should between 3 and 20 chars")
	private String city;
	@NotEmpty
	@NotEmpty
	@Size(min =3, max = 20, message= "size should between 3 and 20 chars")
	private String state;
	@NotEmpty
	@NotEmpty
	@Size(min =3, max = 20, message= "size should between 3 and 20 chars")
	private String country;

}
