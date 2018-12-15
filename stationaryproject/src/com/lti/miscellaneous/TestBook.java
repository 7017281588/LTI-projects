package com.lti.miscellaneous;



public class TestBook {
	public static void main(String ar[]) {
		
		Book p2 = new Book();
	    p2.setBookId(1);
		p2.setbookName("Rotomac");
		p2.setyearOfPublish(50);
		p2.setbookAuthor("Black");
		
		System.out.println(p2.toString());
		
	}
}
