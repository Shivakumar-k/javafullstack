package com.xworkz.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.thing")

public class WrapperConfigure {

	public WrapperConfigure() {
		System.out.println("No arg constructor ");
	}

	@Bean
	public Integer age() {
		System.out.println("Registering age method");
		return 22;

	}

	@Bean
	public Integer shoeSize() {
		System.out.println("Registering shoe method");
		return 8;

	}

	@Bean
	public Integer id() {
		System.out.println("registering id ");
		return 10;
	}

	@Bean
	public Integer bikeNumber() {
		System.out.println("registering BikeNo ");
		return 1245;
	}

	@Bean
	public Integer houseNumber() {
		System.out.println("registering HouseNo ");
		return 54;
	}

	@Bean
	public Integer roomNumber() {
		System.out.println("registering RoomNo ");
		return 12;
	}

	@Bean
	public Integer pinCodeNumber() {
		System.out.println("registering Pin-Code Number ");
		return 560086;
	}

	@Bean
	public Integer busNumber() {
		System.out.println("registering Bus Number ");
		return 89;
	}

	@Bean
	public Integer trainNumber() {
		System.out.println("registing Train Number ");
		return 14404;
	}

	@Bean
	public Integer tokenNumber() {
		System.out.println("registering Token Number ");
		return 26;
	}

	@Bean
	public Character aerpolane() {
		System.out.println("registering aerpolane ");
		return 'A';
	}

	@Bean
	public Character bat() {
		System.out.println("registering bat ");
		return 'B';
	}

	@Bean
	public Character cat() {
		System.out.println("registering cat ");
		return 'C';
	}

	@Bean
	public Character dog() {
		System.out.println("registering dog ");
		return 'D';
	}

	@Bean
	public Character envelope() {
		System.out.println("registering envelope ");
		return 'E';
	}

	@Bean
	public Character fight() {
		System.out.println("registering fight ");
		return 'F';
	}

	@Bean
	public Character goods() {
		System.out.println("registering goods ");
		return 'G';
	}

	@Bean
	public Character hut() {
		System.out.println("registing hut");
		return 'H';
	}

	@Bean
	public Character iceCream() {
		System.out.println("registering iceCream");
		return 'I';
	}

	@Bean
	public Long mobNumber() {
		System.out.println("registering mobNumber ");
		return 9369456258L;
	}

	@Bean
	public Long gstNumber() {
		System.out.println("registering gstNumber ");
		return 589634625L;
	}

	@Bean
	public Long invoiceNumber() {
		System.out.println("registering invoiceNumber ");
		return 8345678956452L;
	}

	@Bean
	public Long registrationNumber() {
		System.out.println("registering registrationNumber ");
		return 9689632145825L;
	}

	@Bean
	public Long accountNumber() {
		System.out.println("registering accountNumber ");
		return 85589648561616L;
	}

	@Bean
	public Long uniqueNumber() {
		System.out.println("registering uniqueNumber ");
		return 9678963214586L;
	}

	@Bean
	public Long chesisNumber() {
		System.out.println("registering chesisNumber ");
		return 757853654895L;
	}

	@Bean
	public Long engineNumber() {
		System.out.println("registing engineNumber");
		return 8966321547896L;
	}

	@Bean
	public Long otherNumber() {
		System.out.println("registering otherNumber");
		return 8948962145878L;
	}

	@Bean
	public Float length() {
		System.out.println("registering length ");
		return 254.6f;
	}

	@Bean
	public Float height() {
		System.out.println("registering height ");
		return 72.589f;
	}

	@Bean
	public Float width() {
		System.out.println("registering width ");
		return 1783.4f;
	}

	@Bean
	public Float weight() {
		System.out.println("registering weight ");
		return 1245.789f;
	}

	@Bean
	public Float distance() {
		System.out.println("registering distance ");
		return 4523.6f;
	}

	@Bean
	public Float unique() {
		System.out.println("registering unique ");
		return 645.2f;
	}

	@Bean
	public Float destination() {
		System.out.println("registering unique ");
		return 9543.786f;
	}

	@Bean
	public Float water() {
		System.out.println("registing unique");
		return 154.786f;
	}

	@Bean
	public Float balance() {
		System.out.println("registering balance");
		return 457.8962f;
	}

	@Bean
	public Double lenght1() {
		System.out.println("registering lenght ");
		return 125554.6;
	}

	@Bean
	public Double height1() {
		System.out.println("registering height ");
		return 168.58;
	}

	@Bean
	public Double width1() {
		System.out.println("registering wid ");
		return 1283.46;
	}

	@Bean
	public Double weight1() {
		System.out.println("registering wei ");
		return 4555.78981;
	}

	@Bean
	public Double dis() {
		System.out.println("registering dis ");
		return 25653.658;
	}

	@Bean
	public Double uni() {
		System.out.println("registering uni ");
		return 45155.25458;
	}

	@Bean
	public Double des() {
		System.out.println("registering unique ");
		return 543515.786;
	}

	@Bean
	public Double wt() {
		System.out.println("registing uni");
		return 54548.786;
	}

	@Bean
	public Double ac() {
		System.out.println("registering ac");
		return 457515.8962;
	}

	@Bean
	public Byte speed1() {
		System.out.println("registering speed1 ");
		return 125;
	}

	@Bean
	public Byte speed2() {
		System.out.println("registering speed3 ");
		return 71;
	}

	@Bean
	public Byte speed3() {
		System.out.println("registering speed3 ");
		return 12;
	}

	@Bean
	public Byte speed4() {
		System.out.println("registering speed4 ");
		return 45;
	}

	@Bean
	public Byte speed5() {
		System.out.println("registering speed5 ");
		return 25;
	}

	@Bean
	public Byte speed6() {
		System.out.println("registering speed6 ");
		return 45;
	}

	@Bean
	public Byte speed7() {
		System.out.println("registering speed7 ");
		return 56;
	}

	@Bean
	public Byte speed8() {
		System.out.println("registing speed8");
		return 54;
	}

	@Bean
	public Byte speed9() {
		System.out.println("registering speed9");
		return 45;
	}

	@Bean
	public Short length1() {
		System.out.println("registering length1 ");
		return 155;
	}

	@Bean
	public Short length2() {
		System.out.println("registering length2 ");
		return 145;
	}

	@Bean
	public Short length3() {
		System.out.println("registering length3 ");
		return 1856;
	}

	@Bean
	public Short length4() {
		System.out.println("registering length4 ");
		return 455;
	}

	@Bean
	public Short length5() {
		System.out.println("registering length5 ");
		return 2555;
	}

	@Bean
	public Short length6() {
		System.out.println("registering length6 ");
		return 145;
	}

	@Bean
	public Short length7() {
		System.out.println("registering length7 ");
		return 595;
	}

	@Bean
	public Short length8() {
		System.out.println("registing length8");
		return 533;
	}

	@Bean
	public Short length9() {
		System.out.println("registering length9");
		return 1283;
	}

	@Bean
	public Boolean condition1() {
		System.out.println("registering condition1 ");
		return true;
	}

	@Bean
	public Boolean condition2() {
		System.out.println("registering condition2 ");
		return true;
	}

	@Bean
	public Boolean condition3() {
		System.out.println("registering condition3 ");
		return false;
	}

	@Bean
	public Boolean condition4() {
		System.out.println("registering condition4 ");
		return true;
	}

	@Bean
	public Boolean condition5() {
		System.out.println("registering condition5 ");
		return false;
	}

	@Bean
	public Boolean condition6() {
		System.out.println("registering condition6 ");
		return true;
	}

	@Bean
	public Boolean condition7() {
		System.out.println("registering condition7 ");
		return false;
	}

	@Bean
	public Boolean condition8() {
		System.out.println("registing condition8");
		return true;
	}

	@Bean
	public Boolean condition9() {
		System.out.println("registering length9");
		return true;
	}

}
