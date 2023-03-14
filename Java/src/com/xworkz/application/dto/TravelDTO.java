package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class TravelDTO implements Serializable {
	
	private String destination;
	private LocalDate startDAte;
	private LocalDate endDAte;
	private String noOfPeople;
	
	public TravelDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("No arg const ");
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(destination, endDAte, noOfPeople, startDAte);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelDTO other = (TravelDTO) obj;
		return Objects.equals(destination, other.destination) && Objects.equals(endDAte, other.endDAte)
				&& Objects.equals(noOfPeople, other.noOfPeople) && Objects.equals(startDAte, other.startDAte);
	}

	@Override
	public String toString() {
		return "TravelDTO [destination=" + destination + ", startDAte=" + startDAte + ", endDAte=" + endDAte
				+ ", noOfPeople=" + noOfPeople + "]";
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getStartDAte() {
		return startDAte;
	}

	public void setStartDAte(LocalDate startDAte) {
		this.startDAte = startDAte;
	}

	public LocalDate getEndDAte() {
		return endDAte;
	}

	public void setEndDAte(LocalDate endDAte) {
		this.endDAte = endDAte;
	}

	public String getNoOfPeople() {
		return noOfPeople;
	}

	public void setNoOfPeople(String noOfPeople) {
		this.noOfPeople = noOfPeople;
	}
	

}
