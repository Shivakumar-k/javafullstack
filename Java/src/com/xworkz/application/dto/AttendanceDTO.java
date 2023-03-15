package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class AttendanceDTO implements Serializable {
	
	private String section;
	private int totalStudents;
	private int boys;
	private int girls;
	private boolean allPresent;
	
	
	public AttendanceDTO() {
		System.out.println("no-arg const");
	}
	
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getTotalStudents() {
		return totalStudents;
	}
	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}
	public int getBoys() {
		return boys;
	}
	public void setBoys(int boys) {
		this.boys = boys;
	}
	public int getGirls() {
		return girls;
	}
	public void setGirls(int girls) {
		this.girls = girls;
	}
	public boolean isAllPresent() {
		return allPresent;
	}
	public void setAllPresent(boolean allPresent) {
		this.allPresent = allPresent;
	}

	@Override
	public String toString() {
		return "AttendanceDTO [section=" + section + ", totalStudents=" + totalStudents + ", boys=" + boys + ", girls="
				+ girls + ", allPresent=" + allPresent + "]";
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(allPresent, boys, girls, section, totalStudents);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttendanceDTO other = (AttendanceDTO) obj;
		return allPresent == other.allPresent && boys == other.boys && girls == other.girls
				&& Objects.equals(section, other.section) && totalStudents == other.totalStudents;
	}
}
