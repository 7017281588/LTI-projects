package com.lti.miscellaneous;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class Login {
	@Test (timeout = 5000, expected = NumberFormatException.class)
	public void m5()
	 {
		
		System.out.println("Enter username : ");
		Scanner sc = new Scanner(System.in);
		String	username = sc.nextLine();
		System.out.println("Enter pass : ");
		String	password = sc.nextLine();
		assertEquals("admin",username);
		assertEquals("admin@123",password);
		 System.out.println("Welcome to the Universe ");
//		 if(username.equals(" "))
	//	 {
	//		 throw NullPointerException();
	//	 }
	 }
}
