package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class MarketDTO implements Serializable {
	
	private String marketName;
	private String location;
	private int size;
	private String type;
	
	public MarketDTO() {
		System.out.println("no- arg cons");
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "MarketDTO [marketName=" + marketName + ", location=" + location + ", size=" + size + ", type=" + type
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(location, marketName, size, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarketDTO other = (MarketDTO) obj;
		return Objects.equals(location, other.location) && Objects.equals(marketName, other.marketName)
				&& size == other.size && Objects.equals(type, other.type);
	}
	
	

}
