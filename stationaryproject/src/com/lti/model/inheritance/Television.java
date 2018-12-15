package com.lti.model.inheritance;

public class Television  extends Gadget{
	private int screenSize;
	private int channelNumber;
	private boolean maxScreen;
	
	Television ( Gadget g , int screenSize){
		this.manufacturer=g.manufacturer;
		this.yrOfMfg=g.yrOfMfg;
		this.price=g.price;
		this.screenSize= screenSize;
	}




public void turnOn() {
	int chNum=101;
     changeChannel=channelNumber;
	
}

private void maxScreen()
{
	maxScreen = true;
	}

public void turnOff() {
	
	
	this.changeChannel
}

}