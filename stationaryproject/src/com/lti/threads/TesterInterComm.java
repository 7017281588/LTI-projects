package com.lti.threads;

import java.util.Scanner;

public class TesterInterComm {

	public static void main(String [] args) {
	
		
		/*Scanner scanner= new Scanner(System.in);
		System.out.println("enter your message");
		String message = scanner.nextLine() */
	//	Data data = new Data(msg);
	//	Sender sender= new Sender(data1); 
		
		
		
		
		Data msg= new Data("process it");
		Data msg2= new Data("java multithreading...");
		Sender sender1= new Sender(msg2);
		Sender sender2= new Sender(msg);
		new Thread(sender2, "sender2").start();
		
		Receiver receiver= new Receiver(msg);
		receiver.start();
		sender2.start();
		new Thread(receiver,"receiver").start();
		System.out.println("all threads are started");
	}
}

		
		
	

