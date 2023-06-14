package com.xworkz.mall.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.extern.slf4j.Slf4j;
@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.mall")
@Slf4j
public class MallConfigure implements WebMvcConfigurer {
	
	public MallConfigure() {
		log.info("Running MallConfigure");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		log.info("Running addViewControllers method");
		registry.addViewController("/").setViewName("start");
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();;
	}
	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}

}
