package com.lti.practise;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String ar[])
	{
		StringBuilder sb1 = new StringBuilder();
		sb1.append("This is a new String");
		System.out.println(sb1.length()+" Length");
		System.out.println(sb1.capacity()+" capacity");
		sb1.ensureCapacity(100);
		System.out.println(sb1.capacity());
		System.out.println(sb1.charAt(10));
		
		sb1.reverse();
		System.out.println(sb1);
		
		sb1.replace(0,10, "Wokay");
		System.out.println(sb1);
		System.out.println(sb1.substring(5,10));
		String names = "aahna<3,reena,sunny,ria,tina,nitin";
		StringTokenizer tokens = new StringTokenizer(names, ", ");
		while (tokens.hasMoreElements())
		{
			String element = (String) tokens.nextElement();
			System.out.println(element);
		}
		String [] newnames = names.split(",");
		System.out.println(Arrays.toString(newnames));
	}
}
