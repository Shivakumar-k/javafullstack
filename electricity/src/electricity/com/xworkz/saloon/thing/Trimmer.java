package electricity.com.xworkz.saloon.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;
@Component
@ToString
public class Trimmer {

	private String brand;
	@Value("white")
	private  String color;
	@Value("2000.0")
	private double price;
	@Value("15")
	private double height;
	public Trimmer(@Value("philips")String brand) {
		
		this.brand = brand;
		
		
		
	}
	

}
