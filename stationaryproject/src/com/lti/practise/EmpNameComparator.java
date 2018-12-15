package com.lti.practise;
import java.util.*;
public class EmpNameComparator implements Comparator <Emp> {


	
	
	@Override
	public int compare(Emp e1, Emp e2) {
		
		return (e1.getName().compareTo(e2.getName()));
	
	}

}
