package com.xworkz.application.dto;

import com.xworkz.application.constants.Language;
import com.xworkz.application.constants.Type;
import com.xworkz.application.constants.Supported;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ApplicationDTO implements Serializable {

	private String name;
	private String developedBy;
	private LocalDate createdDate;
	private double size;
	private double version;
	private java.awt.Window.Type type = type.NORMAL;
	private double price;
	private LocalDate firstVersionReleaseDate;// (past date)
	private LocalDate currentVersionReleaseDate;// (<todaty)
	private LocalDate nextVersionReleaseDate;// (>today)
	private int trialDays;
	private Language langUsed = Language.ENGLISH;
	private double minProcessorSpeed;
	private double minRamSpaceRequired;
	private boolean internetNeeded;
	private int ageLimit;
	private int noOfDownloads;
	private int rating;
	private Supported osTypeSupported = Supported.ANDROID;

	public ApplicationDTO() {
		System.out.println("no-arg constructor");
	}

	public ApplicationDTO(String name, String developedBy, LocalDate createdDate, double size, double version,
			Type type, double price, LocalDate firstVersionReleaseDate, LocalDate currentVersionReleaseDate,
			LocalDate nextVersionReleaseDate, int trialDays, Language langUsed, double minProcessorSpeed,
			double minRamSpaceRequired, boolean internetNeeded, int ageLimit, int noOfDownloads, int rating,
			Supported osTypeSupported) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.createdDate = createdDate;
		this.size = size;
		this.version = version;
		this.type = type;
		this.price = price;
		this.firstVersionReleaseDate = firstVersionReleaseDate;
		this.currentVersionReleaseDate = currentVersionReleaseDate;
		this.nextVersionReleaseDate = nextVersionReleaseDate;
		this.trialDays = trialDays;
		this.langUsed = langUsed;
		this.minProcessorSpeed = minProcessorSpeed;
		this.minRamSpaceRequired = minRamSpaceRequired;
		this.internetNeeded = internetNeeded;
		this.ageLimit = ageLimit;
		this.noOfDownloads = noOfDownloads;
		this.rating = rating;
		this.osTypeSupported = osTypeSupported;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public Type getType() {
		return type;
	}

	public void setType(java.awt.Window.Type normal) {
		this.type = normal;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getFirstVersionReleaseDate() {
		return firstVersionReleaseDate;
	}

	public void setFirstVersionReleaseDate(LocalDate firstVersionReleaseDate) {
		this.firstVersionReleaseDate = firstVersionReleaseDate;
	}

	public LocalDate getCurrentVersionReleaseDate() {
		return currentVersionReleaseDate;
	}

	public void setCurrentVersionReleaseDate(LocalDate currentVersionReleaseDate) {
		this.currentVersionReleaseDate = currentVersionReleaseDate;
	}

	public LocalDate getNextVersionReleaseDate() {
		return nextVersionReleaseDate;
	}

	public void setNextVersionReleaseDate(LocalDate nextVersionReleaseDate) {
		this.nextVersionReleaseDate = nextVersionReleaseDate;
	}

	public int getTrialDays() {
		return trialDays;
	}

	public void setTrialDays(int trialDays) {
		this.trialDays = trialDays;
	}

	public Language getLangUsed() {
		return langUsed;
	}

	public void setLangUsed(Language langUsed) {
		this.langUsed = langUsed;
	}

	public double getMinProcessorSpeed() {
		return minProcessorSpeed;
	}

	public void setMinProcessorSpeed(double minProcessorSpeed) {
		this.minProcessorSpeed = minProcessorSpeed;
	}

	public double getMinRamSpaceRequired() {
		return minRamSpaceRequired;
	}

	public void setMinRamSpaceRequired(double minRamSpaceRequired) {
		this.minRamSpaceRequired = minRamSpaceRequired;
	}

	public boolean isInternetNeeded() {
		return internetNeeded;
	}

	public void setInternetNeeded(boolean internetNeeded) {
		this.internetNeeded = internetNeeded;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public int getNoOfDownloads() {
		return noOfDownloads;
	}

	public void setNoOfDownloads(int noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Supported getOsTypeSupported() {
		return osTypeSupported;
	}

	public void setOsTypeSupported(Supported osTypeSupported) {
		this.osTypeSupported = osTypeSupported;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ageLimit, createdDate, currentVersionReleaseDate, developedBy, firstVersionReleaseDate,
				internetNeeded, langUsed, minProcessorSpeed, minRamSpaceRequired, name, nextVersionReleaseDate,
				noOfDownloads, osTypeSupported, price, rating, size, trialDays, type, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ApplicationDTO)) {
			return false;
		}
		ApplicationDTO other = (ApplicationDTO) obj;
		return ageLimit == other.ageLimit && Objects.equals(createdDate, other.createdDate)
				&& Objects.equals(currentVersionReleaseDate, other.currentVersionReleaseDate)
				&& Objects.equals(developedBy, other.developedBy)
				&& Objects.equals(firstVersionReleaseDate, other.firstVersionReleaseDate)
				&& internetNeeded == other.internetNeeded && langUsed == other.langUsed
				&& Double.doubleToLongBits(minProcessorSpeed) == Double.doubleToLongBits(other.minProcessorSpeed)
				&& Double.doubleToLongBits(minRamSpaceRequired) == Double.doubleToLongBits(other.minRamSpaceRequired)
				&& Objects.equals(name, other.name)
				&& Objects.equals(nextVersionReleaseDate, other.nextVersionReleaseDate)
				&& noOfDownloads == other.noOfDownloads && osTypeSupported == other.osTypeSupported
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && rating == other.rating
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size) && trialDays == other.trialDays
				&& type == other.type && Double.doubleToLongBits(version) == Double.doubleToLongBits(other.version);
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", developedBy=" + developedBy + ", createdDate=" + createdDate
				+ ", size=" + size + ", version=" + version + ", type=" + type + ", price=" + price
				+ ", firstVersionReleaseDate=" + firstVersionReleaseDate + ", currentVersionReleaseDate="
				+ currentVersionReleaseDate + ", nextVersionReleaseDate=" + nextVersionReleaseDate + ", trialDays="
				+ trialDays + ", langUsed=" + langUsed + ", minProcessorSpeed=" + minProcessorSpeed
				+ ", minRamSpaceRequired=" + minRamSpaceRequired + ", internetNeeded=" + internetNeeded + ", ageLimit="
				+ ageLimit + ", noOfDownloads=" + noOfDownloads + ", rating=" + rating + ", osTypeSupported="
				+ osTypeSupported + "]";
	}

}
