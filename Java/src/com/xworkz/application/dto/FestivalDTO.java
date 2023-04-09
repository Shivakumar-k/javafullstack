package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.application.constants.Sweet;

public class FestivalDTO implements Serializable {

	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private Sweet sweetName;
	private String godName;

	public FestivalDTO() {
		System.out.println("no-arg Constructor in HeadphoneDTO");
	}

	public FestivalDTO(String name, LocalDate startDate, LocalDate endDate, Sweet sweetName, String godName) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.sweetName = sweetName;
		this.godName = godName;
	}

	@Override
	public String toString() {
		return "FestivalDTO [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", sweetName="
				+ sweetName + ", godName=" + godName + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Sweet getSweetName() {
		return sweetName;
	}

	public void setSweetName(Sweet sweetName) {
		this.sweetName = sweetName;
	}

	public String getGodName() {
		return godName;
	}

	public void setGodName(String godName) {
		this.godName = godName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(endDate, godName, name, startDate, sweetName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FestivalDTO other = (FestivalDTO) obj;
		return Objects.equals(endDate, other.endDate) && Objects.equals(godName, other.godName)
				&& Objects.equals(name, other.name) && Objects.equals(startDate, other.startDate)
				&& sweetName == other.sweetName;
	}

}
