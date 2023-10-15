package com.kishore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kishore.entity.Teacher;

@Configuration
@ComponentScan(basePackages = "com.kishore")
public class BeanConfig {

	@Bean
	public Teacher teacher() {
		return new Teacher();
	}

}
