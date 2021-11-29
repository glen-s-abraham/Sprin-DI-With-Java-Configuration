package com.glen.SpringDIJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Phone getPhone() {
		return new Phone();
	}
	
	@Bean
	public MobileProcessor getMobileProcessor() {
		return new SnapDragon();
	}
}
