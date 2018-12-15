package com.lti.practise;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Lists {

	public static void main(String ar[])
	{
		List listofsals = new ArrayList();
		listofsals.add(3343.34);
		listofsals.add(4545.67);
		listofsals.add("a");
		
		Iterator iterator = listofsals.iterator();
		while(iterator.hasNext())
		{
			Double sal = (Double) iterator.next();
			System.out.println(sal);
		}
	}
}
