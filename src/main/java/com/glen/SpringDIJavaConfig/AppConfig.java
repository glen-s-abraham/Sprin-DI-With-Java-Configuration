package com.glen.SpringDIJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(initMethod = "createPhone", destroyMethod = "destroyPhone")
	public Phone getPhone() {
		return new Phone();
	}
	
	@Bean
	public MobileProcessor getMobileProcessor() {
		return new SnapDragon();
	}
	
	@Bean 
	public EventListenerClass getEventListenerClass() {
		return new EventListenerClass();
	}
}
