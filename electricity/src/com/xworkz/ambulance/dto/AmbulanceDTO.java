package com.xworkz.ambulance.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class AmbulanceDTO implements Serializable, Comparable<AmbulanceDTO>{
	 

	@Min(value = 0, message = "value should be greater than 0")
	@Max(value = 100, message = "value should be less than 100")
	private int id;
	@Min(value = 0, message = "value should be greater than 0")
	@Max(value = 100, message = "value should be less than 100")
	private int regNo;
	@Min(value = 0, message = "value should be greater than 0")
	@Max(value = 100, message = "value should be less than 100")
	private int chasisNo;
	@NotEmpty

	@Size(min = 2, max = 30, message = "value should be between 2 nad 30")
	private String ownerName;

	private boolean insuranceExpired;
	@NotEmpty

	@Size(min = 2, max = 30, message = "value should be between 2 nad 30")
	private String driverName;

	private LocalDate startDate;

	public AmbulanceDTO() {
		System.out.println("no-arg constructor in AmbulanceDTO");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public int getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(int chasisNo) {
		this.chasisNo = chasisNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public boolean isInsuranceExpired() {
		return insuranceExpired;
	}

	public void setInsuranceExpired(boolean insuranceExpired) {
		this.insuranceExpired = insuranceExpired;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chasisNo;
		result = prime * result + ((driverName == null) ? 0 : driverName.hashCode());
		result = prime * result + id;
		result = prime * result + (insuranceExpired ? 1231 : 1237);
		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
		result = prime * result + regNo;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AmbulanceDTO)) {
			return false;
		}
		AmbulanceDTO other = (AmbulanceDTO) obj;
		if (chasisNo != other.chasisNo) {
			return false;
		}
		if (driverName == null) {
			if (other.driverName != null) {
				return false;
			}
		} else if (!driverName.equals(other.driverName)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (insuranceExpired != other.insuranceExpired) {
			return false;
		}
		if (ownerName == null) {
			if (other.ownerName != null) {
				return false;
			}
		} else if (!ownerName.equals(other.ownerName)) {
			return false;
		}
		if (regNo != other.regNo) {
			return false;
		}
		if (startDate == null) {
			if (other.startDate != null) {
				return false;
			}
		} else if (!startDate.equals(other.startDate)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "AmbulanceDTO [id=" + id + ", regNo=" + regNo + ", chasisNo=" + chasisNo + ", ownerName=" + ownerName
				+ ", insuranceExpired=" + insuranceExpired + ", driverName=" + driverName + ", startDate=" + startDate
				+ "]";
	}

	public AmbulanceDTO(int id, int regNo, int chasisNo, String ownerName, boolean insuranceExpired, String driverName,
			LocalDate startDate) {
		super();
		this.id = id;
		this.regNo = regNo;
		this.chasisNo = chasisNo;
		this.ownerName = ownerName;
		this.insuranceExpired = insuranceExpired;
		this.driverName = driverName;
		this.startDate = startDate;
	}

	@Override
	public int compareTo(AmbulanceDTO o) {

		return this.getOwnerName().compareTo(o.getOwnerName());
	}

}


