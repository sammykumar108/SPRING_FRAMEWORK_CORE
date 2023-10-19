package com.sammy.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/sammy/constructorInjection/config.xml");
		
		Student st = context.getBean("st",Student.class);
		
		System.out.println(st);
		
		
		
		
	}
}
