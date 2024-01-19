package com.xworkz.signUpPage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="sign_up")
public class SignUpEntity {
    @Id
    @Column(name="userid")
	private int id;
    @Column(name="uname")
	private String uname;
    @Column(name="upwd")
	private String password;
    @Column(name="uemail")
	private String email;
    @Column(name="umobile")
	private String mobileNo;
    @Column(name="otp")
	private String otp;
}
