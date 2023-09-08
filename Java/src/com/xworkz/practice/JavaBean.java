package com.xworkz.practice;

import java.util.Objects;

public class JavaBean {
	
	private String name;
	private String address;
	private int age;
	
	public JavaBean() {
		// TODO Auto-generated constructor stub
	}
	
	public JavaBean(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JavaBean other = (JavaBean) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "JavaBean [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	

}
