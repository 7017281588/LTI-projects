package com.lti.threads;

public class IncrementThread  extends Thread{

	
	
	

	public IncrementThread(VolatileDemo vdemo1) {
		// TODO Auto-generated constructor stub
	}

	public VolatileDemo getVdemo() {
		return vdemo;
	}

	public void setVdemo(VolatileDemo vdemo) {
		this.vdemo = vdemo;
	}

	VolatileDemo vdemo = new VolatileDemo();
	
	public void run() {
		vdemo.increment();
		
		try {
			
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Interuppteddcsd");
		}
		
	}
		
	}

