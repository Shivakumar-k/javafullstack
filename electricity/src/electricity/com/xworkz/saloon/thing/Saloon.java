package electricity.com.xworkz.saloon.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

//import lombok.ToString;

@ToString
@Component
public class Saloon {

	private String name;
	private String ownerName;
	private String type;
	private String location;
	private int noOfBarbers;

	public Saloon(@Value("Freash Cutz") String name, @Value("ashish") String ownerName,
			@Value("Mens Saloon") String type, @Value("Rajajinagar") String location, @Value("3") int noOfBarbers) {

		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.location = location;
		this.noOfBarbers = noOfBarbers;
	}

}
