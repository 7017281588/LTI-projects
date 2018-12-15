package com.lti.model;

public class Pen {

	private static int ctr = 0;
	private int id;
	private String brand;	
	private float price;
	private String color_of_ink;
	
	
	Private class InkChanger()
	{
		String newcolorB;
		
	}
		
	}

	
	
	

//CONSTRUCTOR
	Pen()
	   {
		System.out.println("Default Constructor created....");
		ctr++;
	    }
	
	Pen(int a, String b, float c, String d)
	{
		 System.out.println("Para construct..");
		 this.id = a;
		 this.brand=b;
		 this.price=c;
		 this.color_of_ink =d;
		 ctr++;
	}
	
	//setter methods
	
	public void setID( int idd) {
		this.id = idd;
	}

	public void setBrand(String s) {
		this.brand = s;
	}
	public void setPrice(float f) {
		this.price = f;
	}
	
	public void setColorOfInk(String ss) {
		this.color_of_ink = ss;
	}
	
	
	//getter
	 public int getId()
	 {return this.id ;}
	
	 public String getBrand()
	{return this.brand;}
	
	 public float getPrice()
	 {return this.price ;}
	 
	 public String getColorOfInk()
	 {return this.color_of_ink ;}
	 
	 public String toString()
	 {
		 return "Id :"+ this.id +"\n" + "Brand :"+ this.brand +"\n"+
	 "Price :"+ this.price+ "\n"+"Color :"+ this.color_of_ink; 
	 }
	 
	public void setBrand()
     {
				String brandName = "Reynolds";
				this.brand = brandName;
				System.out.println("The brand is "+ this.brand);
      }
}
