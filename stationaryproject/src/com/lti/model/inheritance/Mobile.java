package com.lti.model.inheritance;

public class Mobile {
	
	private String opSys;

	private String brand;
	private CoverColor covercolor;
	public String getOpSys() {
		return opSys;
	}
	public void setOpSys(String opSys) {
		this.opSys = opSys;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public CoverColor getCovercolor() {
		return covercolor;
	}
	public void setCovercolor(CoverColor covercolor) {
		this.covercolor = covercolor;
	}
	
	public void turnOn(){
	displayLogo();
	playMusic();
	init();
	}
	private static void displayLogo(){
		System.out.println("displayLogo");
		
	}
	private static void playMusic(){
		System.out.println("pm");
		
	}
	private static void init(){
		System.out.println("initialised");
		
	}
	
	public void turnOff()
	{
		closeAllApps();
		
	}
public static void closeAllApps()
{
	System.out.println("closing");}
@Override
public String toString() {
	return "Mobile [opSys=" + opSys + ", brand=" + brand + ", covercolor=" + covercolor + "]";
}
public Mobile() {
	super();
	// TODO Auto-generated constructor stub
}

public Mobile(String s,CoverColor c) {}

//super();
}



