package com.example.demo.bean2;

import org.springframework.stereotype.Component;

@Component("addr") 
public class Address {
	
	private int pincode;
	private String streetname;
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", streetname=" + streetname + "]";
	}
	
	public void addre() {
		System.out.println("Address Bean has been autowired to Employee Bean.");
	}
	
}
