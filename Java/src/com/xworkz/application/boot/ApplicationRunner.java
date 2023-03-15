package com.xworkz.application.boot;

import java.awt.Window.Type;
import java.time.LocalDate;

import com.xworkz.application.constants.Language;
import com.xworkz.application.constants.Supported;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.service.ApplicationService;
import com.xworkz.application.service.ApplicationServiceImplements;

public class ApplicationRunner {

	public static void main(String[] args) {

		ApplicationDTO application = new ApplicationDTO();

		application.setName("Facebook");
		application.setDevelopedBy("Zuck");
		application.setCreatedDate(LocalDate.of(2004, 8, 13));
		application.setSize(80);
		application.setVersion(2.24D);
		application.setType(Type.ANDROID);
		application.setPrice(500);
		application.setFirstVersionReleaseDate(LocalDate.of(2004, 2, 4));
		application.setCurrentVersionReleaseDate(LocalDate.of(2022, 1, 1));
		application.setNextVersionReleaseDate(LocalDate.of(2024, 1, 1));
		application.setTrialDays(90);
		application.setLangUsed(Language.ENGLISH);
		application.setMinProcessorSpeed(50);
		application.setMinRamSpaceRequired(200);
		application.setInternetNeeded(true);
		application.setAgeLimit(18);
		application.setNoOfDownloads(5);
		application.setRating(5);
		application.setOsTypeSupported(Supported.ANDROID);
		application.toString();
		System.out.println(application);

		ApplicationService applicationService = new ApplicationServiceImplements();
		boolean saved = applicationService.validateAndThenSave(application);
		System.out.println("saved " + saved);

	}

}
