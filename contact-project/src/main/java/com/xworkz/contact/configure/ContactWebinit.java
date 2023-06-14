package com.xworkz.contact.configure;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.contact.constant.ContactConstant;

public class ContactWebinit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		return new Class[] {ContactConfigure.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings()");
		return new String[] {"/"};
	}
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize = 800000000;
		MultipartConfigElement configElement = new MultipartConfigElement(ContactConstant.TEMP_FILE_NAME, maxSize, maxSize*2, maxSize/2);
		registration.setMultipartConfig(configElement);
	}

}
