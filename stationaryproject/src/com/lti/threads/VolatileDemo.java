package com.lti.threads;

public class VolatileDemo {

volatile	int x;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public VolatileDemo() {
this.x =100;
		// TODO Auto-generated constructor stub
	}

	public void increment()
	{
		this.x = x+=10;
		}
	
	public void decrement()
	{
		this.x = x-=10;
		}

}
