package com.lti.practise;

public class Gen1<T> {

	T t1;
	Gen1(T t)
	{
		this.t1 = t;
	}
	public void add(T t)
	{
		System.out.println("Object added of type"+ t);
	}
	
	public T getT() {
		
		return this.t1;
	}
}
