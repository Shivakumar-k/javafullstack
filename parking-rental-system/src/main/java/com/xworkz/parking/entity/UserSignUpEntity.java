package com.xworkz.parking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

@Table(name = "user_sign_up")
@NamedQuery(name = "findByUserSignUpEmail", query = "select value from UserSignUpEntity as value where value.email=:byUserSignUpEmail")
//@NamedQuery(name = "updateOtp", query = "update UserSignUpEntity value set value.otp=:updateOtp where value.email=:byUserSignUpEmail")
//@NamedQuery(name = "findByOTP", query = "select value from UserSignUpEntity as value where value.otp=:byUserOtp")
public class UserSignUpEntity {
	@Id
	@Column(name = "user_id")
	private int id;
	@Column(name = "user_name")
	private String name;
	@Column(name = "user_email")
	private String email;
	@Column(name = "user_password")
	private String password;
	@Column(name = "user_mobile")
	private long mobile;
	@Column(name = "user_address")
	private String address;

	@Column(name = "user_otp")
	private int otp;

}
