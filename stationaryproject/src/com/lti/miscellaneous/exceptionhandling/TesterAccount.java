package com.lti.miscellaneous.exceptionhandling;

public class TesterAccount {
	
 public static void main(String[] args) {
	
	 Account acc1 = new Account(12121,"savings",56000);
	 try {
		acc1.withdraw(50000);
	} catch (LessFundsException e) {
	System.out.println("e.getMessage()");
		
	}
	 System.out.println(acc1.getAccountBalance());
}
}
