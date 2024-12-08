package com.springcore.autowiring.annotation;

import org.springframework.context.support.AbstractApplicationContext;
//import com.springcore.autowiring.annotation.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/autowiring/annotation/autowiring_config.xml");
		Employee1 emp1 = (Employee1) context.getBean("emp1");
		System.out.println(emp1);
	}

}
