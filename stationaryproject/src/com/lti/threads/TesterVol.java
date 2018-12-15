package com.lti.threads;

public class TesterVol {

public static void main(String[] args) {
	VolatileDemo vdemo1 = new VolatileDemo();
	
	IncrementThread t1 = new IncrementThread(vdemo1);
t1.start();

IncrementThread t2 = new IncrementThread(vdemo1);
t2.start();

IncrementThread t3 = new IncrementThread(vdemo1);
t3.start();

IncrementThread t4 = new IncrementThread(vdemo1);
t4.start();

DecrementThread t5 = new DecrementThread(vdemo1);
DecrementThread t6 = new DecrementThread(vdemo1);
DecrementThread t7 = new DecrementThread(vdemo1);
DecrementThread t8 = new DecrementThread(vdemo1);

t5.start();
System.out.println(vdemo1.getX());
t6.start();
System.out.println(vdemo1.getX());
t7.start();
System.out.println(vdemo1.getX());
t8.start();

System.out.println(vdemo1.getX());
System.out.println("hello"
		+ "");
}

}
