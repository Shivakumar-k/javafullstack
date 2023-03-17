package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.constants.Brand;
import com.xworkz.application.constants.Color;
import com.xworkz.application.constants.TypeAndWeight;
import com.xworkz.application.dto.HeadphoneDTO;
import com.xworkz.application.util.ValidationUtil;

public class HeadphoneImplements implements HeadphoneService{

	@Override
	public
	boolean validateAndSave(HeadphoneDTO dto) {
		
		System.out.println("validateAndThenSave method runninng...: "+dto);
		
		if(dto !=null)
		{
			System.out.println("dto id not null...");
			
			Brand brand=dto.getBrand();
			Color color=dto.getColor();
			TypeAndWeight typeAndWeight=dto.getTypeAndWeight();
			String modelNo=dto.getModelNo();
			String customerName=dto.getCustomerName();
			int invoiceNo=dto.getInvoiceNo();
			int warrantyPeriod=dto.getWarrantyPeriod();
			double price=dto.getPrice();
			boolean bass=dto.isBass();
			LocalDate mfgDate=dto.getMfgDate();
			
			boolean validBrand=false;
			boolean validColor=false;
			boolean validTypeAndWeight=false;
			boolean validModelNo=false;
			boolean validCustomerName=false;
			boolean validInvoiceNo=false;
			boolean validWarrantyPeriod=false;
			boolean validPrice=false;
			boolean validBass=false;
			boolean validMfgDate=false;
			
			if(brand != null) {
				System.out.println("Brand is Valid");
				validBrand=true;
			}
			else {
				System.err.println("Brand is invalid");
			}
			if(color != null) {
				System.out.println("Color is Valid");
				validColor=true;
			}
			else {
				System.err.println("Color is invalid");
			}
			if(typeAndWeight != null) {
				System.out.println("TypeAndWeight is Valid");
				validTypeAndWeight=true;
			}
			else {
				System.err.println("TypeAndWeight is invalid");
			}
			
			if(ValidationUtil.validString(modelNo)) {
				System.out.println("ModelNo is valid");
				validModelNo=true;
				
			}
			else {
				
				System.err.println("ModelNo is Invalid");
			}
			if(ValidationUtil.validString(customerName)) {
				System.out.println("CustomerName is valid");
				validCustomerName=true;
				
			}
			else {
				
				System.err.println("CustomerName is Invalid");
			}
			if(ValidationUtil.validInt(invoiceNo)) {
				System.out.println("InvoiceNo is valid");
				validInvoiceNo=true;
				
			}
			else {
				
				System.err.println("InvoiceNo is Invalid");
			}
			if(ValidationUtil.validInt(warrantyPeriod)) {
				System.out.println("WarrantyPeriod is valid");
				validWarrantyPeriod=true;
				
			}
			else {
				
				System.err.println("WarrantyPeriod is Invalid");
			}
			if(ValidationUtil.validDouble(price)) {
				System.out.println("Price is valid");
				validPrice=true;
				
			}
			else {
				
				System.err.println("Price is Invalid");
			}
			if(bass) {
				System.out.println("Bass is valid");
				validBass=true;
				
			}
			else {
				
				System.err.println("Bass is Invalid");
			}
			if(ValidationUtil.validDate(mfgDate)) {
				System.out.println("mfgDate is valid");
				validMfgDate=true;
				
			}
			else {
				
				System.err.println("mfgDate is Invalid");
			}
			
			if(ValidationUtil.valigFlag(validBrand,validColor,validTypeAndWeight,validModelNo,validCustomerName,validInvoiceNo,validWarrantyPeriod,validPrice,validBass,validMfgDate)) {
				System.out.println("Validation is complete ");
				
			}
			else {
				System.err.println("Validation is not complete");
			}
			
			
		}
		else {
			System.err.println("dto is null...");
		}

		return false;
	}
}
