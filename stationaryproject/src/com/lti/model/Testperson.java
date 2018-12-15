package com.lti.model;

public class Testperson {
 
	public static void main( String ar[])
	{
			Person p1 = new Person()  {
			
				public void eat()
				{
					System.out.println("Eat");
				}
				public void sleep()
				{
					System.out.println("sleep");
				}
	   };
		
					p1.eat();
					p1.sleep();
		
	  }
}
