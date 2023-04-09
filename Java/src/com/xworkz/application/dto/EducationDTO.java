package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class EducationDTO implements Serializable {

	private int id;
	private String name;
	private String degreeName;
	private double percentage;
	private String university;
	private LocalDate startDate;
	private LocalDate endDate;
	private boolean backlog;
	private String stream;

	public EducationDTO() {
		super();
	}

	public EducationDTO(int id, String name, String degreeName, double percentage, String university,
			LocalDate startDate, LocalDate endDate, boolean backlog, String stream) {
		super();
		this.id = id;
		this.name = name;
		this.degreeName = degreeName;
		this.percentage = percentage;
		this.university = university;
		this.startDate = startDate;
		this.endDate = endDate;
		this.backlog = backlog;
		this.stream = stream;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getUniversity() {
		return university;
	}

	public void setUnivercity(String university) {
		this.university = university;
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

	public boolean getBacklog() {
		return backlog;
	}

	public void setBacklog(boolean backlog) {
		this.backlog = backlog;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public int hashCode() {
		return Objects.hash(backlog, degreeName, endDate, id, name, percentage, startDate, stream, university);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EducationDTO other = (EducationDTO) obj;
		return backlog == other.backlog && Objects.equals(degreeName, other.degreeName)
				&& Objects.equals(endDate, other.endDate) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& Objects.equals(startDate, other.startDate) && Objects.equals(stream, other.stream)
				&& Objects.equals(university, other.university);
	}

	@Override
	public String toString() {
		return "EducationDTO [id=" + id + ", name=" + name + ", degreeName=" + degreeName + ", percentage=" + percentage
				+ ", university=" + university + ", startDate=" + startDate + ", endDate=" + endDate + ", backlog="
				+ backlog + ", stream=" + stream + "]";
	}

}
