package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycle_config.xml");

//		Using XML:

		Dish d1 = (Dish) context.getBean("d1");
		System.out.println(d1);
//		Registering shutdown hook 
		context.registerShutdownHook();

		System.out.println("----------------");

//		Using interface

		Pepsi p1 = (Pepsi) context.getBean("pepsi1");
		System.out.println(p1);

//		Using annotation

		Annotation an1 = (Annotation) context.getBean("an1");
		System.out.println(an1);

	}

}
