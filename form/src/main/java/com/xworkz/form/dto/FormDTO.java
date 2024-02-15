package com.xworkz.form.dto;

import java.io.Serializable;
import lombok.*;

@Data
@NoArgsConstructor
public class FormDTO implements Serializable {
	
	private String name;
	private String email;
	private int age;
	private String city;
	
	

}
