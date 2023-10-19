package com.sammy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// Tightly coupled
		/*
		 * Ram ram=new Ram(); ram.eat(); ram.sleep();
		 * 
		 * Shyam shyam=new Shyam(); shyam.eat(); shyam.sleep();
		 */

		/*
		 * Action ac=new Ram(); ac.eat(); ac.sleep();
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("com/sammy/config.xml");
		System.out.println(context);

		Ram sh = context.getBean("person", Ram.class);
		sh.eat();
		sh.sleep();
		
		
		
	}

}
