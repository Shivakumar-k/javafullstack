package com.xworkz.contact.configure;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.contact")

public class ContactConfigure implements WebMvcConfigurer {
	
	public ContactConfigure() {
		System.out.println("Running no arg cont of ContactConfigure");
	}
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		System.out.println("running addViewControllers in configure");
		registry.addViewController("/").setViewName("/Home.jsp");
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	@Bean
	public MultipartResolver multipartResolver() {
		System.out.println(" running multipart REsolver");
		return new StandardServletMultipartResolver();
	}
	
	
	

}
