package com.lti.threads;

public class Sender extends Thread {

	private Data data;
	Sender (Data data)
	{
		this.data = data;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Says hello...");
		
		
		data.setMessage("wait over..");
		System.out.println("Sending notification to all waiting threads....");
		data.notifyAll();
	}
}
