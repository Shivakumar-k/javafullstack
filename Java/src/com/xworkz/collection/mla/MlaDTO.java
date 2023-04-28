package com.xworkz.collection.mla;

import java.io.Serializable;
import java.util.Objects;

public class MlaDTO implements Serializable {
	
	
	private String name;
	private Integer age;
	private String constituancy;
	private String party;
	private boolean independent;
	private String gender;
	
	public MlaDTO() {
		System.out.println("No-Arg constructor");
	}

	public MlaDTO(String name, int age, String constituancy, String party, boolean independent, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.constituancy = constituancy;
		this.party = party;
		this.independent = independent;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getConstituancy() {
		return constituancy;
	}

	public void setConstituancy(String constituancy) {
		this.constituancy = constituancy;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public boolean isIndependent() {
		return independent;
	}

	public void setIndependent(boolean independent) {
		this.independent = independent;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, constituancy, gender, independent, name, party);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MlaDTO other = (MlaDTO) obj;
		return age == other.age && Objects.equals(constituancy, other.constituancy)
				&& Objects.equals(gender, other.gender) && independent == other.independent
				&& Objects.equals(name, other.name) && Objects.equals(party, other.party);
	}

	@Override
	public String toString() {
		return "MlaDTO [name=" + name + ", age=" + age + ", constituancy=" + constituancy + ", party=" + party
				+ ", independent=" + independent + ", gender=" + gender + "]";
	}
	
	

}
