package com.xworkz.application.util;

import java.time.LocalDate;

public class EducationValidation {

	public EducationValidation() {
		System.out.println("No argument constructor");
	}

	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 1 && value.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validInt(int value) {
		if (value > 0) {
			return true;
		}
		return false;
	}

	public static boolean validBoolean(boolean value) {
		if (value!= false) {
			return true;
		}
		return false;
	}

	public static boolean validDouble(double value) {
		if (value > 0) {
			return true;
		}
		return false;
	}

	public static boolean validDate(LocalDate value1) {
		LocalDate startDate = LocalDate.of(2010, 6, 1);
		LocalDate endDate = LocalDate.of(2022, 12, 31);
		if (value1 != null && !value1.isBefore(startDate) && value1.isBefore(endDate)) {
			return true;
		}
		return false;
	}

	public static boolean validFlag(boolean... flag) {
		for (int index = 0; index < flag.length; index++) {
			boolean element = flag[index];
			if (!element) {
				return false;
			}

		}
		return true;
	}

}
