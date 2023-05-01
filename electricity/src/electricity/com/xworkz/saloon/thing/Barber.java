package electricity.com.xworkz.saloon.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;
@ToString
@Component
public class Barber {
	
	private String name;
	private int experiance;
	private double salary;
	private int age;
	private long contactNo;
	private String gender;
	public Barber(@Value("Ragava") String name,@Value("6") int experiance,@Value("30000") double salary, @Value("26")int age, @Value("8945612325")long contactNo,@Value("Male") String gender) {
		
		this.name = name;
		this.experiance = experiance;
		this.salary = salary;
		this.age = age;
		this.contactNo = contactNo;
		this.gender = gender;
	}
	
	
	

}
