package com.sammy.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("#{2+3}")
	public int sum;
	
	@Value("#{5-3}")
	public int sub;
	
	@Value("#{2*3}")
	public int mul;
	
	@Value("#{15/3}")
	public int div;
	
//	@Value("#{1==1}")
//	@Value("#{1!=1}")
//	@Value("#{1>=3}")
//	@Value("#{1<=3}")
//	@Value("#{1 lt 3}")
//	@Value("#{1 gt 3}")
//	@Value("#{1 eq 3}")
//	@Value("#{1 ne 3}")
//	@Value("#{1 le 3}")
	@Value("#{1 ge 3}")
	public boolean equalValid;
	
//	@Value("#{1==3 && 2==2}")
//	@Value("#{1==3 || 2==2}")
	@Value("#{1==3 && 2==2}")
	public boolean ckeckStatus;
	
	@Value("#{2>3 ? 'Yes' : 'No'}")
	public String terinaryCheck;
	
//	@Value("#{T(java.lang.Math).sqrt(144)}")
	@Value("#{T(java.lang.Math).PI}")
	public int num;
	
	public static String call()
	{
		return "Method calling";
	}
	
	
	@Value("#{T(com.sammy.spEL.Student).call()}")
	public String result;
	

	@Override
	public String toString() {
		return "Student [sum=" + sum + ", sub=" + sub + ", mul=" + mul + ", div=" + div + ", equalValid=" + equalValid
				+ ", ckeckStatus=" + ckeckStatus + ", terinaryCheck=" + terinaryCheck + "]";
	}


	
	
	
	
	
}
