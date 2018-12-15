package com.lti.threads;

public class Receiver extends Thread {
	private Data data;
	
	
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	Receiver(Data d)
	{
		
	}
	
	public void run()
	{
		
		System.out.println("Waiting..");
		System.out.println("Thread.currentThread().getName()");
		synchronized (data){
			
			
		try {
			data.wait();
		} catch (InterruptedException e) {
			System.out.println("Wait interrupted.....");
			e.printStackTrace();
		}}
		
		
		System.out.println("received the data");
		System.out.println(data.getMessage());
		System.out.println("Still waiting..");
		
	}

}
