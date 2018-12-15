package com.lti.miscellaneous;
import java.util.Arrays;
public class ArrayTest {
public static void main (String ar[])
{
	char var1 = 'a';
	char [] vararr = new char [10];
	int [] nums = new int[10];
	 for (int i=0; i<10;++i) {
		 vararr[i] = 'a';
		 
		 nums[i] = (int) vararr[i];
		 i++;
	 }
	 
	 System.out.println(Arrays.toString(vararr));
	 System.out.println(Arrays.toString(nums));	 
}
	
}
