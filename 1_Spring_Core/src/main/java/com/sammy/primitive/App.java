package com.sammy.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sammy/primitive/config.xml");
		
		Student st = context.getBean("st1",Student.class);
		System.out.println(st);
		
		Student st2 = context.getBean("st2",Student.class);
		System.out.println(st2);
		
		
		
	}

}
