package com.xworkz.parking.configure;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ParkingWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		return new Class[] { ParkingConfigure.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings(");
		return new String[] { "/" };
	}

}
