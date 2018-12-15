package com.lti.model;

public class TestPen {

	public static void main(String ar[]) {
		
				Pen p1 = new Pen();
			    p1.setID(1);
				p1.setBrand("Rotomac");
				p1.setPrice(50.0f);
				p1.setColorOfInk("Black");
				System.out.println(p1.toString());
				
				
				Pen p2 = new Pen(2,"Parker",200.f,"blue");
				System.out.println(p2.toString());
	}
	/*public void greet()
	{
		System.out.println("Hello world"); // instance method since not static
	}*/
}
