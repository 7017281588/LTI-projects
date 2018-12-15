package com.lti.model;

import java.util.*;

public class TestEmpMan  {

	public static void main(String ar[])
	{
     Employee e3 = new Employee();
     Employee e4 = new Employee();
     Employee e5 = new Employee();
     
     Manager e22 = new Manager();
     
     Employee e1 = new Employee();
     e1.greeting();
     Employee m2 = new Manager();
     Employee e2 = new Employee();
     e2.greeting();
     
     if (e2 instanceof Manager)
     {
    	 Manager m1 = (Manager) e2;
    	 m1.greeting();
     }
     Scanner sc1 = new Scanner(System.in);
     System.out.println("Enter the type of employee :");
     String typeofemp = sc1.nextLine();
     
     if (typeofemp.equals("Employee"))
     {
    	 e3 = new Employee();
     }
     else if(typeofemp.equals("Manager"))
     {
    	 e3 = new Manager();
     }
     
     callGreeting(e3);
     callGreeting(e22);
	}
	public static void callGreeting(Employee
			e)
	{
		if(e instanceof Employee )
		{
			e.greeting();
		}
		else if(e instanceof Manager )
		{
			e.greeting();
		}
		
	}
    /* e1.setId(1);
     e1.setName("Paul");
     e1.setSalary(500.0f);
System.out.println(e1.toString());
}
*/	
}