package com.sammy.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	@Autowired
//	@Qualifier("ad2") // If there is multiple Bean then use @Qualifier annotation
	private Address address;

//	@Autowired
//	public Student(Address address) {
//		super();
//		this.address = address;
//		System.out.println("Constructor injection");
//	}

	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		System.out.println("Setter injection");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
