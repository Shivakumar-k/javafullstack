package com.xworkz.newsLetter.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.newsLetter")
public class NewsLetterConfigure implements WebMvcConfigurer {
	
	public NewsLetterConfigure() {
		System.out.println("Running NewsLetterConfigure no arg const.");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		System.out.println("running addViewControllers");
		registry.addViewController("/").setViewName("subPage.jsp");
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	

}
