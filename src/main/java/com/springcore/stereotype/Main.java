package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotype_config.xml");
		
		
		
		Student student = (Student) context.getBean("stu1", Student.class);
		
		
		System.out.println(student.getFriends());
	}
}
