package com.lti.model;

import java.util.Scanner;

public class TestShape {

	public static void main(String ar[])
	{
		 Scanner sc = new Scanner(System.in );
		 
		 System.out.println("Enter the Shape to  be drawn :");
		 System.out.println("1.equilateral triangle :");
		 System.out.println("2. isosceles triangle :");
		 System.out.println("3. Square :");
		 
		 int choice = sc.nextInt();
		 switch(choice)
		 {
		 case 1: 
			 shape = new Equilateral();
			 break;
		 case 2:
			 shape = new Isosceles();
			 break;
		 case 3:
			 shape = new Square(); 
			 break;
			 default :
				 System.out.println("Enter the value b/w 1 & 3 :");
		 
		 
		 }
		 
		 
		 System.out.println();
		
	}
}
