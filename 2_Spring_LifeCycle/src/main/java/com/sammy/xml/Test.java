package com.sammy.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
			
//		ApplicationContext context=new ClassPathXmlApplicationContext("com/sammy/xml/config.xml");
//		
//		Student st = context.getBean("st1",Student.class);
//		System.out.println(st);
//		
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/sammy/xml/config.xml");
		context.registerShutdownHook();
		
		Student st = context.getBean("st1",Student.class);
		System.out.println(st);
		
		
	}
}
