package com.xworkz.form.configure;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer  {

	public SpringWebInit() {
		System.out.println("Running SpringWebInit const..");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses..");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses..");
		return  new Class[] {FormConfigure.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings..");
		return new String[] {"/"};
	}
	
	

}
