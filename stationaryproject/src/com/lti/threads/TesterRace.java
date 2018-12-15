package com.lti.threads;

public class TesterRace {
 public static void main(String[] args) {
	
	 Racer r1 = new Racer(10);
	 r1.start();
	 
	 Racer r2 = new Racer(10);
	 r2.start();
	 
	 Runnable r11 = new Race();
	 Thread t1 = new Thread(r11);
	 
	 
	 
	 Runnable r12 = new Race();
	 Thread t2 = new Thread(r12);
	 
	 t1.start();
	 
	 t2.start();
    t2.setPriority(8);
	 t1.setName("Srishti");
	 t2.setName("utsav");
}
}
