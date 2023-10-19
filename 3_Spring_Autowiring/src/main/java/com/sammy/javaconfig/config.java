package com.sammy.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ComponentScan(basePackages = "com.sammy.javaconfig")
public class config {

	@Bean
	
	public Address add()
	{
		return new Address("First bean");
	}
	
	/*
	 * @Bean
	 * 
	 * @Primary public Address getaddress() { return new Address("Second bean"); }
	 */
	
	@Bean(name = {"emps"})
	public Emp getEmp()
	{
		return new Emp(add());
	}
	
}
