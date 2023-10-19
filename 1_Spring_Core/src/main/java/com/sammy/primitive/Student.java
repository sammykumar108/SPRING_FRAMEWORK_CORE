package com.sammy.primitive;

public class Student {

	private int id;
	
	private String name;
	
	private String address;
	
	public void setId(int id)
	{
		
		System.out.println("setter injection: id");
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		System.out.println("setter injection: name");
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAddress(String address)
	{
		System.out.println("setter injection: address");
		this.address=address;
		
	}
	
	public String getAddress()
	{
		return address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
