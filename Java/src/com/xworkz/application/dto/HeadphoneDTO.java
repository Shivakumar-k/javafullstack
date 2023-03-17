package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.application.constants.Brand;
import com.xworkz.application.constants.Color;
import com.xworkz.application.constants.TypeAndWeight;

public class HeadphoneDTO implements Serializable {
	
	private Brand brand;
	private Color color;
	private TypeAndWeight typeAndWeight;
	private String modelNo,customerName;
	private int invoiceNo,warrantyPeriod;
	private double price;
	private boolean bass;
	private LocalDate mfgDate;
	
	public HeadphoneDTO() {
		System.out.println("no-arg Constructor in HeadphoneDTO");
	}
	
	public HeadphoneDTO(Brand brand, Color color, TypeAndWeight typeAndWeight, String modelNo, String customerName,
			int invoiceNo, int warrantyPeriod, double price, boolean bass, LocalDate mfgDate) {
		super();
		this.brand = brand;
		this.color = color;
		this.typeAndWeight = typeAndWeight;
		this.modelNo = modelNo;
		this.customerName = customerName;
		this.invoiceNo = invoiceNo;
		this.warrantyPeriod = warrantyPeriod;
		this.price = price;
		this.bass = bass;
		this.mfgDate = mfgDate;
	}

	@Override
	public String toString() {
		return "HeadphoneDTO: [brand=" + brand + ", color=" + color + ", type=" + typeAndWeight +", Weight:"+TypeAndWeight.WIRELESS.getWeight() + ", modelNo="
				+ modelNo + ", customerName=" + customerName + ", invoiceNo=" + invoiceNo + ", warrantyPeriod="
				+ warrantyPeriod + ", price=" + price + ", bass=" + bass + ", mfgDate=" + mfgDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bass, brand, color, customerName, invoiceNo, mfgDate, modelNo, price, typeAndWeight,
				warrantyPeriod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeadphoneDTO other = (HeadphoneDTO) obj;
		return bass == other.bass && brand == other.brand && color == other.color
				&& Objects.equals(customerName, other.customerName) && invoiceNo == other.invoiceNo
				&& Objects.equals(mfgDate, other.mfgDate) && Objects.equals(modelNo, other.modelNo)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& typeAndWeight == other.typeAndWeight && warrantyPeriod == other.warrantyPeriod;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public TypeAndWeight getTypeAndWeight() {
		return typeAndWeight;
	}

	public void setTypeAndWeight(TypeAndWeight typeAndWeight) {
		this.typeAndWeight = typeAndWeight;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBass() {
		return bass;
	}

	public void setBass(boolean bass) {
		this.bass = bass;
	}

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}
	
	

}
