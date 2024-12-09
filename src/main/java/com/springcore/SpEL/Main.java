package com.springcore.SpEL;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/springcore/SpEL/SpEL_config.xml");
		
		
		
		Student student = context.getBean("stu1", Student.class);
		System.out.println(student);
		
		SpelExpressionParser parser = new SpelExpressionParser();
		SpelExpression expression = (SpelExpression) parser.parseExpression("23+11");
		System.out.println(expression.getValue());
		
//		Student student1 = (Student) context.getBean("stu1", Student.class);
//		System.out.println(student1.hashCode());
	}
}
