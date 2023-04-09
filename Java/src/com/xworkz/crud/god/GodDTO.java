package com.xworkz.crud.god;

import java.io.Serializable;
import java.util.Objects;

public class GodDTO implements Serializable {
	
	private String name;
	private String religion;
	private String knownFor;
	private String festival;
	private int noOfholidays;
	
	public GodDTO() {
		System.out.println("No-arg Constructor");
	}

	public GodDTO(String name, String religion, String knownFor, String festival, int noOfholidays) {
		super();
		this.name = name;
		this.religion = religion;
		this.knownFor = knownFor;
		this.festival = festival;
		this.noOfholidays = noOfholidays;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getKnownFor() {
		return knownFor;
	}

	public void setKnownFor(String knownFor) {
		this.knownFor = knownFor;
	}

	public String getFestival() {
		return festival;
	}

	public void setFestival(String festival) {
		this.festival = festival;
	}

	public int getNoOfholidays() {
		return noOfholidays;
	}

	public void setNoOfholidays(int noOfholidays) {
		this.noOfholidays = noOfholidays;
	}

	@Override
	public int hashCode() {
		return Objects.hash(festival, knownFor, name, noOfholidays, religion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GodDTO other = (GodDTO) obj;
		return Objects.equals(festival, other.festival) && Objects.equals(knownFor, other.knownFor)
				&& Objects.equals(name, other.name) && noOfholidays == other.noOfholidays
				&& Objects.equals(religion, other.religion);
	}

	@Override
	public String toString() {
		return "GodDTO [name=" + name + ", religion=" + religion + ", knownFor=" + knownFor + ", festival=" + festival
				+ ", noOfholidays=" + noOfholidays + "]";
	}
	
	
	
	

}
