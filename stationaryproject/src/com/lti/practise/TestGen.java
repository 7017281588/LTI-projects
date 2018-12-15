package com.lti.practise;
import com.lti.model.Pen;
public class TestGen {

	public static void main(String[] args) {
		
		Gen1<String> genstring = new Gen1<>("hello there");
		System.out.println(genstring.getT());
		genstring.add("using generics");
		
		Gen1<Pen> genpen= new  Gen1<> (new Pen(12, "parker",343,"black"));
		Pen p1 = genpen.getT();
		System.out.println(p1);
		
		
		
		
		
		
		
		
		
		
		System.out.println(p1);
	}
}
