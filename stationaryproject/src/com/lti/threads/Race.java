package com.lti.threads;

public class Race implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("okay");
				e.printStackTrace();
			}
		}
		
	}

	
}
