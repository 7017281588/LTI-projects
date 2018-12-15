package com.lti.miscellaneous.exceptionhandling;

public class Account {
private int accountid;
private String accounttype;
private float accountbal;


public Account(int accountid, String accounttype, float accountbal) {
	super();
	this.accountid = accountid;
	this.accounttype = accounttype;
	this.accountbal = accountbal;
}


public int getAccountid() {
	return accountid;
}


public void setAccountid(int accountid) {
	this.accountid = accountid;
}


public String getAccounttype() {
	return accounttype;
}


public void setAccounttype(String accounttype) {
	this.accounttype = accounttype;
}


public float getAccountbal() {
	return accountbal;
}


public void setAccountbal(float accountbal) {
	this.accountbal = accountbal;
}

	private void applyCharges()
	{
	
			class Audit {
				
				float charges = 0.0f;
	
				void calculatecharges(int daysoverdue) {
		
		if(daysoverdue>7 && daysoverdue<=10) {
			
			charges = 200.00f;
		}
		        System.out.println("Account balance"+ accountbal);
		         accountbal = accountbal - charges;
		         System.out.println(accountbal);
	}
}
}
}

/*public void withdraw (double amt) throws LessFundsException
{
	if(amt > this.accbalance)
	
}*/
