package com.lti.miscellaneous;
import java.util.*;

public class Fact {
 
	 public static  void main(String ar[])
	 {
		 
		 System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			Fact f1 = new Fact();
		   int res = f1.factorial(n);
		   System.out.println(res);
		   
	 }
	     public int factorial(int f )
	
	{
	   int i,k=1;
		for( i=1;i<=f;i++)
		{
			 k=k*i;
		}
		return k;
	}
}

