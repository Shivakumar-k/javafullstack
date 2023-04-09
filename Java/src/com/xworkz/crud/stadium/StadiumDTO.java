package com.xworkz.crud.stadium;

import java.io.Serializable;
import java.util.Objects;

public class StadiumDTO implements Serializable {
	
	private String name;
	private String stateName;
	private int capacity;
	private double ticketPrice;
	
	public StadiumDTO() {
		System.out.println("No-arg constructor");
	}

	public StadiumDTO(String name, String stateName, int capacity, double ticketPrice) {
		super();
		this.name = name;
		this.stateName = stateName;
		this.capacity = capacity;
		this.ticketPrice = ticketPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacity, name, stateName, ticketPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StadiumDTO other = (StadiumDTO) obj;
		return capacity == other.capacity && Objects.equals(name, other.name)
				&& Objects.equals(stateName, other.stateName)
				&& Double.doubleToLongBits(ticketPrice) == Double.doubleToLongBits(other.ticketPrice);
	}

	@Override
	public String toString() {
		return "StadiumDTO [name=" + name + ", stateName=" + stateName + ", capacity=" + capacity + ", ticketPrice="
				+ ticketPrice + "]";
	}
	
	

}
