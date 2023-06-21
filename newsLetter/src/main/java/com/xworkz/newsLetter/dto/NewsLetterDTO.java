package com.xworkz.newsLetter.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class NewsLetterDTO implements Serializable {
	
	private String name;
	private String email;
	private String number;
	private String intrest;
	private String file;
	
}
