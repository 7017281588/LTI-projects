package com.lti.miscellaneous;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class TestCalc {
 Calculator c = new Calculator();
 
 
 @BeforeClass
 public  static void m1()
 {
	 System.out.println("Testing Begins...");
	 
 }
 
 @AfterClass
 public  static void m2()
 {
	 System.out.println("Testing Ends...");
	 
 }
 
 @Before
  public void m3()
  {
	 System.out.println("Before testing..unit level");
  }
 @After
 public void m4()
 {
	 System.out.println("After testing..unit level");
 }
 @Test
	public void testAdd() {
		assertEquals(12,c.add(6,6));
		
	}

	@Test
	public void testSub() {
		assertEquals(0,c.sub(6,6));
		
	}

	@Test
	public void testProduct() {
		assertEquals(36,c.product(6,6));
		;
	}

	@Test
	public void testDivide() {
		assertEquals(1,c.divide(6,6));
		
	}
	long expected;
	int value1;
	int value2;
	
	@Parameters
	
	
	public static Collection data()
	{
		return
				Arrays.asList(new Object[] []
						{{1,0,1},{10,5,5},{23,18,5},{34,17,17}});}
			
	
	public TestCalc(long expected, int value1,int value2)
		{
			this.expected = expected;
			this.value1 = value1;
			this.value2 = value2;
		}
	
	public void m7() {
		
	assertEquals(expected, new Calculator().add(value1,value2));
	}
				
	}
	
