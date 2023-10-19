package com.sammy.annotation;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
			

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/sammy/annotation/config.xml");
		context.registerShutdownHook();
		
		Student st = context.getBean("st1",Student.class);
		System.out.println(st);
		
		
	}
}
