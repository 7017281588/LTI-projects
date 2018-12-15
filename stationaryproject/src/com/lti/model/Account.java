package com.lti.model;

public class Account {

	private int accountId;
	private String accountType;
 	private double accountBalance;
	
	
	public int getAccountId() {
		return accountId;
	}


	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public double getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}


	public void applyCharges() {
		
	int numDays = 0;
	
	class Audit
	{
	float charges = 0.0f;
	
		void calculateCharges(int daysoverdue)
		 {
			 if(daysoverdue>7 && daysoverdue<=10) 
			 {
				 charges = 1000.00f;
			 }
		 else if (daysoverdue>10)
		 {
			 charges = 2000.00f;
		 }			
		 accountBalance = accountBalance - charges;
		}
	}System.out.println();
}
}