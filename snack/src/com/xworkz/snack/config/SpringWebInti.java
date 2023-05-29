package snack;

import org.springframework.beans.propertyeditors.ClassArrayEditor;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInti extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	
	public SpringWebInti() {
		System.out.println("No-arg cong of SpringWebInti");
	}

	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses...");
		return null;
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses");
		return new Class[] {SpringConfigure.class};
	}
	
	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings.... ");
		return new String[]{"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
