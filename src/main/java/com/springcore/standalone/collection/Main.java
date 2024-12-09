package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standalone_coll_config.xml");
		Person person = (Person) context.getBean("person1");
		System.out.println(person.getFriends().getClass().getName());
		System.out.println(person.getProperties());
	}
}	
