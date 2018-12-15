package com.lti.miscellaneous;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String ar[]) {
		
		//.	Calculator c1 = new Calculator();
			
		Scanner sc = new Scanner(System.in);
			//sc.nextInt()
			int input1, input2, output ;
			
		
			
			System.out.println("Enter no. 1 :");	
			input1 = sc.nextInt();
		     
			System.out.println("Enter no. 2 :");
			input2 = sc.nextInt();
			
			Calculator c1 = new Calculator(input1, input2);
				
			
			output = c1.add(c1.getNum1(), c1.getNum2());
				System.out.println( "Addition result :"+ output);
			
				output = c1.sub(input1, input2);
				System.out.println( "Substraction result :"+ output);
			
				output = c1.product(input1, input2);
				System.out.println( "Multiplication result :"+ output);
			
				output = c1.divide(input1, input2);
				System.out.println( "Division result :"+ output);
				
				Calculator c2 = new Calculator(20,10);
				System.out.println("Add.."+c2.add());
				System.out.println("subs.."+c2.subs());
				System.out.println("prod.."+c2.mul());
				System.out.println("divide.."+c2.divide());
				
				Calculator c3 =  new Calculator(c2);
				c3.add();
				c3.divide();
				
				Calculator  c4= new Calculator();
				c4.setNum1(45);
				c4.setNum2(67);
				System.out.println("Enter numb 1 :");
				System.out.println(c4.add());
				
				System.out.println("Enter numb 2 :");
				System.out.println(c4.subs());
				sc.close();
	}
}
