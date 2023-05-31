package com.xworkz.passport.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.passport.controller")
public class PassportConfigure implements WebMvcConfigurer {
	
	public PassportConfigure() {
		System.out.println("Running PassportConfigure");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		System.out.println("Running addViewControllers method");
		registry.addViewController("/").setViewName("index.jsp");
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
