package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class Bank {

	private String name;
	private String address;
	private String phone;
	private String email;
	private int accountNumber;
	private double balance;
	private double interestRate;
	private double withdrawalLimit;
	private boolean accountActive;

	public Bank(@Value("SBI")String name,@Value("Rajajinagar") String address,@Value("78941239") String phone,@Value("shiva@gmail.cam") String email,@Value("19987413") int accountNumber,@Value("8529.35d") double balance,
			@Value("7.2d")	double interestRate,@Value("200000.0d") double withdrawalLimit, @Value("true") boolean accountActive) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		this.withdrawalLimit = withdrawalLimit;
		
		this.accountActive = accountActive;
		
	}
public String bankName() {
	return "SBI";
}

}
