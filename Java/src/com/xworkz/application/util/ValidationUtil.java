package com.xworkz.application.util;

import java.time.LocalDate;

public class ValidationUtil {
		
		private ValidationUtil() {
			System.out.println("no-arg constructor in validationUtil");
		}
		
		public static boolean validString(String value) {
			if(value !=null && value.length() > 3 && value.length() < 30) {
				return true;
			}
			return false;
		}
		
		public static boolean validInt(int value1) {
			if(value1 >0 && value1 < 100000) {
				return true;
			}
			return false;
			
		}
		
		public static boolean validDouble(double price) {
			if(price > 100 && price < 100000) {
				return true;
			}
			return false;
			
		}
		public static boolean validDate(LocalDate date) {
			LocalDate tomorrow= LocalDate.now().plusDays(1);
			LocalDate pastDate = LocalDate.of(2023, 1, 5);
			if(date != null && date.isBefore(tomorrow) && date.isAfter(pastDate)) {
				return true;
			}
			return false;
		}
		
		public static boolean valigFlag(boolean... flags) {
			for(int index=0;index< flags.length;index++) {
				boolean temp=flags[index];
						if(!temp) {
							System.out.println("elements is false at index "+index);
							return false;
						}
			}
			return true;
		}
		
			

			
		}

