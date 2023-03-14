package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class AwarenessDTO implements Serializable {
	
	
	private String awarenessTopic;
	private LocalDate startDAte;
	private LocalDate endDAte;
	private String targetAudience;
	
	public AwarenessDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("no-arg const");
	}

	public String getAwarenessTopic() {
		return awarenessTopic;
	}

	public void setAwarenessTopic(String awarenessTopic) {
		this.awarenessTopic = awarenessTopic;
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

	public String getTargetAudience() {
		return targetAudience;
	}

	public void setTargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}

	@Override
	public String toString() {
		return "AwarenessDTO [awarenessTopic=" + awarenessTopic + ", startDAte=" + startDAte + ", endDAte=" + endDAte
				+ ", targetAudience=" + targetAudience + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(awarenessTopic, endDAte, startDAte, targetAudience);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AwarenessDTO other = (AwarenessDTO) obj;
		return Objects.equals(awarenessTopic, other.awarenessTopic) && Objects.equals(endDAte, other.endDAte)
				&& Objects.equals(startDAte, other.startDAte) && Objects.equals(targetAudience, other.targetAudience);
	}
	
	

}
