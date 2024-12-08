package com.springcore.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/autowiring/autowiring_config.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
	}

}
