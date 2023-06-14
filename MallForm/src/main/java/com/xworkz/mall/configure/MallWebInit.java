package com.xworkz.mall.configure;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.mall.constant.MallConstant;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class MallWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("Running getServletConfigClasses");
		return new Class[] {MallConfigure.class};
	}

	@Override
	protected String[] getServletMappings() {
		log.info("Running getServletMappings");
		return new String[] {"/"};
	}
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize= 800000000;
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(MallConstant.TEMP_FILE_NAME, maxSize, maxSize*2, maxSize/20);
		registration.setMultipartConfig(multipartConfigElement);
	}
	

}
