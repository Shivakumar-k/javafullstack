package com.xworkz.contact.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name = "contact")

public class ContactEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "c_sno" )
	private int id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_email")
	private String email;
	@Column(name = "c_mobile")
	private long mobile;
	@Column(name = "c_comment")
	private String comments; 
	@Column(name = "c_fileName")
	private String fileName;
	@Column(name = "c_contentType")
	private String contentType;
	@Column(name = "c_size")
	private long fileSize;
	@Column(name = "c_originalFileName")
	private String originalFileName;
	

}
