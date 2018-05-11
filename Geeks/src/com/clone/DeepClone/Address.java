package com.clone.DeepClone;

public class Address {
	int pinCode;
	String City;
	String distric;

	public Address(int pinCode, String city, String distric) {
		super();
		this.pinCode = pinCode;
		City = city;
		this.distric = distric;
	}

	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();

	}
}
