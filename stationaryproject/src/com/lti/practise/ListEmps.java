package com.lti.practise;

import java.util.Iterator;
import java.util.*;

//@SuppressWarnings("deprecation")
public class ListEmps   {

	
	public static void main(String[] args) {
		
		Emp e1 = new Emp(231,"john",33343);
		Emp e2 = new Emp(231,"alex",33455);
		Emp e3 = new Emp(231,"steve",43444);
		
		List <Emp> empList  = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		Emp e4 = new Emp(231,"Monica",44553);
		Emp e5 = new Emp(231,"Joe",43444);
		Emp e6 = new Emp(231,"Leonard",43444);
		
		List <Emp> temp_empList  = new ArrayList <>();
		
		temp_empList.add(e4);
		temp_empList.add(e5);
		temp_empList.add(e6);
		
		List <Emp> allEmployees  = new LinkedList<>()	;
		
				allEmployees.addAll(empList);
				allEmployees.addAll(temp_empList);
				
				Iterator  iterator  = allEmployees.iterator();
				
				while(iterator.hasNext())
				{
					Emp empp = (Emp) iterator.next();
							System.out.println(empp);
				}
				
				allEmployees.remove(2);
				System.out.println("After removing an emp ");
				
				for(Emp e : allEmployees)
				{
					System.out.println(e);
				}
				
				System.out.println(empList);
				System.out.println(temp_empList);
		
				List <Integer> list2 =  new LinkedList<>();
				Integer  [ ] arr2 = {56,34,76,45,78,34,65,13,87,45,863};
				
				list2 = Arrays.asList(arr2);
				
				for (int i : list2)
				{
					System.out.println(i);
				}
				
				Set <Integer> set1  = new HashSet<>();
				set1.addAll(list2);
				System.out.println(set1);
				
				TreeSet <Integer> set11 = new TreeSet<>();
				set11.add(34);
				Integer[ ] arr = {34,56,43,2456,87,3,58,56,55};
				List <Integer>list1 = Arrays.asList(arr);
				set11.addAll(list1);
				System.out.println(set11);
				
				System.out.println("After sorting on salary using comparable : ");
				Collections.sort(allEmployees,new EmpNameComparator());
				
				
				
				for (Emp ee : allEmployees)
				{
					System.out.println(ee);
					
					
				}
				
				
				Map<String ,Emp> empMap = new HashMap<>();
				empMap.put("Admin",e1);
				empMap.put("IT", e2);
				empMap.put( "IT",e3);
				System.out.println("Complete Set..");
				System.out.println(empMap.entrySet());
				System.out.println("Only the values..");
				System.out.println(empMap.values());
				System.out.println("Only the key..");
				System.out.println(empMap.keySet());
		
				
				
				
				
	}
}
