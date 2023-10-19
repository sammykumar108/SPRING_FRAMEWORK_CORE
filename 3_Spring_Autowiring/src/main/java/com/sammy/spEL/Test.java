package com.sammy.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/sammy/spEL/config.xml");
		Student st = context.getBean("student",Student.class);
//		System.out.println(st);
//		System.out.println(st.equalValid);
//		System.out.println(st);
//		System.out.println(st);
//		System.out.println(st.num);
//		System.out.println(st.result);
		
		SpelExpressionParser parser=new SpelExpressionParser();
		org.springframework.expression.Expression ex = parser.parseExpression(" 'Hello World' ");
	
		System.out.println(ex.getValue());
		
	}
}
