package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

// If we are using @Component annotation in the bean class then add @ComponentScan, but here we are explicitly defining bean in this config class so need to add this line
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Course getCourse() {
		return new Course();
	}
	@Bean(name = {"getStudent", "student1", "vidhyarthi"})
	public Student getStudent() {
		Student student = new Student(getCourse());
		return student;
	}
}
