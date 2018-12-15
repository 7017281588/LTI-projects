package com.lti.miscellaneous;
import java.util.*;
public class Calculator {

		static Calculator instance = null;
			//instance var
			private int num1;
			private int num2;
			//private int result;
			
			public static Calculator getInstance()
			{
				if(instance == null )
				{
					instance = new Calculator();
				}
				return instance;
			}
		
			//constructor
			Calculator()
			{
				this.num1 =5;
				this.num2 =10;
			}
			
			//parameter
			Calculator(int a, int b)
			{
				this.num1 =a;
				this.num2 =b;
			}
			
			Calculator( Calculator c)
			{
				this.num1 = c.num1;
				this.num2 =c.num2;
			}
			//getters or accessors
			public int getNum1() {
				return this.num1;
			}
			public int getNum2() {
				return this.num2;
			}
			
			//setters
			public void setNum1(int a)
			{
				this.num1 = a;
				}
			
			public void setNum2(int a)
			{
				this.num2 = a;
			}
			
			public int add()
			{
				return this.getNum1()+ this.getNum2();
			}
			public int subs()
			{
				return this.getNum1()- this.getNum2();
			}
			public int mul()
			{
				return this.getNum1()* this.getNum2();
			}
			public int divide()
			{
				return this.getNum1()/ this.getNum2();
			}
		public int add(int a, int b) {
			
			return a+b;
		}
	
		public int sub(int a, int b) {
			if(a>b)
				return a-b;
			else
				return b-a;
		}
	
		public	int product(int a, int b) {
	
					return a*b;
		}
		
		public int divide(int a, int b) {
	if (a>b)
			return a/b;
	else
			return b/a;
		}
}
