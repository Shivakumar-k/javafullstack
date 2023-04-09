package com.xworkz.crud.desert.dto;

import java.io.Serializable;
import java.util.Objects;

public class DesertDTO implements Serializable{
	
	
	private String name;
	private String country;
	private int area;
	private double maxTemp;
	
	public DesertDTO() {
		System.out.println("No arg constructor");
	}

	public DesertDTO(String name, String country, int area, double maxTemp) {
		super();
		this.name = name;
		this.country = country;
		this.area = area;
		this.maxTemp = maxTemp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public double getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, country, maxTemp, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DesertDTO other = (DesertDTO) obj;
		return area == other.area && Objects.equals(country, other.country)
				&& Double.doubleToLongBits(maxTemp) == Double.doubleToLongBits(other.maxTemp)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "DesertDTO [name=" + name + ", country=" + country + ", area=" + area + ", maxTemp=" + maxTemp + "]";
	}
	
	
	
	

}
