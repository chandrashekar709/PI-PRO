package com.pi.utility;

import org.apache.commons.lang3.RandomStringUtils;

public class RandEmailExp1 {
	public static String randomEmail()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(4);
		String email=generatedstring+"@gmail.com";
		return email;
		   
		  // System.out.println(email);
		   //System.out.println(randomNum);
		   
	}
	public static String randomMobilenum()
	{
		String randomNum=RandomStringUtils.randomNumeric(10);
		return randomNum;
	}
	
}










