package com.lti.model.inheritance;

public enum CoverColor {
	BLACK(1000,"MUMBAI"),GOLDEN(100,"BANGALORE"),ROSE_PINK(50,"PUNE"),WHITE(100,"HYD");
int numsManufactured;
String city;
CoverColor(int n, String city){
	this.numsManufactured=n;
	this.city=city;
	
}
public int getNumsManufactured() {
	return numsManufactured;
}
public void setNumsManufactured(int numsManufactured) {
	this.numsManufactured = numsManufactured;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
