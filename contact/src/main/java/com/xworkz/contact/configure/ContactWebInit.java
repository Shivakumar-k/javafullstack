package com.xworkz.contact.configure;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ContactWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return new Class[] {ContactConfigure.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings(");
		return new  String[] {"/"};
	}

}
