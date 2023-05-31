package com.xworkz.passport.configure;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PassportWebInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return new Class[] {PassportConfigure.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getRootConfigClasses");
		return new String[] {"/"};
	}

}
