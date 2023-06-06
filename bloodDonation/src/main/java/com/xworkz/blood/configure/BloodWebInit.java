package com.xworkz.blood.configure;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BloodWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
	    System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 System.out.println("Running getServletConfigClasses");
		return new Class[] {BloodConfigure.class};
	}

	@Override
	protected String[] getServletMappings() {
		 System.out.println("Running  getServletMappings");
		return new String[] {"/"};
	}

}
