package com.lti.model.inheritance;

public class TestGadget {
public static void main(String ar[]) {
	Mobile m1 = new Mobile ("android", CoverColor.ROSE_PINK);
	m1.turnOn();
	m1.turnOff();
	System.out.println(m1);
	
	Gadget g1= new Television(new Gadget(),54);
	Gadget g2= new Mobile("ios", CoverColor.GOLDEN);
}




{
	
	gadgetOn(g2);
	gadgetOff(g2);
}
public static void gadgetOn(Gadget g) {
	g.turnOn();
}
public static void gadgetOff(Gadget g) {
	g.turnOff();
}
}
