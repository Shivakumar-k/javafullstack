package electricity.com.xworkz.policeStation.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.jboss.logging.annotations.Message;

import io.smallrye.common.constraint.NotNull;



public class PoliceStationDTO implements Serializable,Comparable<PoliceStationDTO>{
	
	@NotNull 
	@Min(1) @Max(100)
	private int id;
	@NotNull
	@Length(min = 2, max = 20)
	private String name;
	@NotNull
	@Length(min = 2, max = 30)
	private String inspectorName;
	@NotNull
	@Length(min = 2, max = 20)
	private String area;
	@NotNull
	@Min(0)
	private int noOfCells;
	
	
	public PoliceStationDTO() {
		System.out.println("Np arg constructor");
	}


	public PoliceStationDTO(int id, String name, String inspectorName, String area, int noOfCells) {
		super();
		this.id = id;
		this.name = name;
		this.inspectorName = inspectorName;
		this.area = area;
		this.noOfCells = noOfCells;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getInspectorName() {
		return inspectorName;
	}


	public void setInspectorName(String inspectorName) {
		this.inspectorName = inspectorName;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public int getNoOfCells() {
		return noOfCells;
	}


	public void setNoOfCells(int noOfCells) {
		this.noOfCells = noOfCells;
	}


	@Override
	public int hashCode() {
		return Objects.hash(area, id, inspectorName, name, noOfCells);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoliceStationDTO other = (PoliceStationDTO) obj;
		return Objects.equals(area, other.area) && id == other.id && Objects.equals(inspectorName, other.inspectorName)
				&& Objects.equals(name, other.name) && noOfCells == other.noOfCells;
	}
	
	


	@Override
	public String toString() {
		return "PoliceStationDTO [id=" + id + ", name=" + name + ", inspectorName=" + inspectorName + ", area=" + area
				+ ", noOfCells=" + noOfCells + "]";
	}


	@Override
	public int compareTo(PoliceStationDTO o) {
		
		return this.name.compareTo(o.name);
	}



	
	
	

}
