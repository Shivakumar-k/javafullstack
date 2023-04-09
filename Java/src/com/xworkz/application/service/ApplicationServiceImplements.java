package com.xworkz.application.service;

import java.awt.Window.Type;
import java.time.LocalDate;

import com.xworkz.application.constants.Language;
import com.xworkz.application.constants.Supported;
import com.xworkz.application.dto.ApplicationDTO;

public class ApplicationServiceImplements implements ApplicationService {

	@Override
	public boolean validateAndThenSave(ApplicationDTO dto) {

		if (dto != null) {

			String name = dto.getName();
			String developedBy = dto.getDevelopedBy();
			LocalDate date = dto.getCreatedDate();
			double size = dto.getSize();
			double version = dto.getVersion();
			Type type = dto.getType();
			double price = dto.getPrice();
			LocalDate date1 = dto.getFirstVersionReleaseDate();
			LocalDate date2 = dto.getCurrentVersionReleaseDate();
			LocalDate date3 = dto.getNextVersionReleaseDate();
			int trialDays = dto.getTrialDays();
			Language lang = dto.getLangUsed();
			double minProcessorSpeed = dto.getMinProcessorSpeed();
			double minRamSpaceRequired = dto.getMinRamSpaceRequired();
			boolean internetNeeded = dto.isInternetNeeded();
			int ageLimit = dto.getAgeLimit();
			int noOfDownloads = dto.getNoOfDownloads();
			int rating = dto.getRating();
			Supported osTypeSupported = dto.getOsTypeSupported();
			boolean validName = false;
			boolean validDevelopedBy = false;
			boolean validDate = false;
			boolean validSize = false;
			boolean validVersion = false;
			boolean validType = false;
			boolean validPrice = false;
			boolean validDate1 = false;
			boolean validDate2 = false;
			boolean validDate3 = false;
			boolean validTrailDays = false;
			boolean validLang = false;
			boolean validMinProcessorSpeed = false;
			boolean validMinRamSpaceRequired = false;
			boolean validInternetNeeded = false;
			boolean validAgeLimit = false;
			boolean validNoOfDownloads = false;
			boolean validRating = false;

			boolean validOsTypeSupported = false;

			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("name is valid");
				validName = true;

			} else {
				System.err.println("name is invalid");
			}

			if (developedBy != null && !developedBy.isEmpty() && developedBy.length() > 3
					&& developedBy.length() < 30) {
				System.out.println("developedBy is validate");
				validDevelopedBy = true;

			} else {
				System.err.println("developedBy is invalid");
			}

			LocalDate tomorrow = LocalDate.now().plusDays(1);
			LocalDate startDate = LocalDate.of(2000, 1, 1);
			if (date != null && date.isBefore(tomorrow) && date.isAfter(startDate)) {
				System.out.println("created date is valid ");
				validDate = true;
			} else {
				System.err.println("Invalid date");
			}

			if (size > 0 && size < 100) {
				System.out.println("valid size");
				validSize = true;
			} else {
				System.err.println("invalid size");
			}

			if (version > 0 && version < 100) {
				System.out.println("version is valid");
				validVersion = true;
			} else {
				System.err.println("version is invalid");
			}
			if (type != null) {
				System.out.println("type is valid");
				validType = true;
			} else {

				System.err.println("type is invalid");
			}

			if (price > 100 && price < 1000) {
				System.out.println("price is valid");
				validPrice = true;
			} else {
				System.err.println("price is invalid");
			}

			LocalDate startDate1 = LocalDate.of(2000, 1, 1);
			if (date1.equals(startDate1)) {
				System.out.println("FirstVersionReleaseDate is valid");
				validDate1 = true;
			} else {
				System.err.println("FirstVersionReleaseDate is invalid");
			}

			LocalDate currentVersionDate = LocalDate.of(2022, 1, 1);
			if (date2.equals(currentVersionDate)) {
				System.out.println("currentVersionReleaseDate is valid");
				validDate2 = true;
			} else {
				System.err.println("currentVersionReleaseDate is invalid");
			}

			LocalDate nextVersionDate = LocalDate.of(2024, 1, 1);
			if (date3.equals(nextVersionDate)) {
				System.out.println("nextVersionReleaseDate is valid");
				validDate3 = true;
			} else {
				System.err.println("nextVersionReleaseDate is invalid");
			}

			if (trialDays > 0 && trialDays < 100) {
				System.out.println("trialDays is valid");
				validTrailDays = true;
			} else {
				System.err.println("trialDays is invalid");

			}

			if (lang != null) {
				System.out.println("langUsed is valid");
				validLang = true;
			} else {
				System.err.println("langUsed is invalid");
			}

			if (minProcessorSpeed > 0 && minProcessorSpeed < 100) {
				System.out.println("minProcessorSpeed is valid");
				validMinProcessorSpeed = true;
			} else {
				System.err.println("minProcessorSpeed is invalid");
			}

			if (minRamSpaceRequired > 0 && minRamSpaceRequired < 300) {
				System.out.println("minRamSpaceRequired is valid");
				validMinRamSpaceRequired = true;
			} else {
				System.err.println("minRamSpaceRequired is invalid");
			}

			if (internetNeeded) {
				System.out.println("internetNeeded is valid");
				validInternetNeeded = true;
			} else {
				System.err.println("internetNeeded is invalid");
			}
			if (ageLimit > 0 && ageLimit <= 18) {
				System.out.println("ageLimit is valid");
				validAgeLimit = true;
			} else {
				System.err.println("ageLimit is invalid");
			}
			if (noOfDownloads > 0 && noOfDownloads < 10) {
				System.out.println("noOfDownloads is valid");
				validNoOfDownloads = true;
			} else {
				System.err.println("noOfDownloads is invalid");
			}
			if (rating > 1 && rating <= 5) {
				System.out.println("rating is valid");
				validRating = true;
			} else {
				System.err.println("rating is invalid");
			}
			if (osTypeSupported != null) {
				System.out.println("osTypeSupported is valid");
				validOsTypeSupported = true;
			} else {
				System.err.println("osTypeSupported is invalid");
			}

			if (validName && validDevelopedBy && validDate && validSize && validVersion && validPrice && validDate1
					&& validDate2 && validDate3 && validTrailDays && validLang && validMinProcessorSpeed
					&& validMinRamSpaceRequired && validInternetNeeded && validAgeLimit && validNoOfDownloads
					&& validRating && validOsTypeSupported) {
				System.out.println("Application is valid ,so we can save");
				return true;

			} else {
				System.err.println("Application is invalid , so we cannot save");
			}

		} else {
			System.err.println("dto is null,cannot continue.....");
		}

		return false;
	}

}
