package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/ref_config.xml");
		A a1 = (A) context.getBean("a1");
		System.out.println(a1.toString());
		System.out.println(a1.getB().getY());
	}

}
