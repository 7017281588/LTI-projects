package com.lti.threads;

public class DecrementThread extends Thread {
	
	
	public DecrementThread(VolatileDemo vdemo12) {
		// TODO Auto-generated constructor stub
	}

	public VolatileDemo getVdemo1() {
		return vdemo1;
	}

	public void setVdemo1(VolatileDemo vdemo1) {
		this.vdemo1 = vdemo1;
	}

	VolatileDemo vdemo1 = new VolatileDemo();
	
	public void run() {
	
		vdemo1.decrement();
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	}
	}
