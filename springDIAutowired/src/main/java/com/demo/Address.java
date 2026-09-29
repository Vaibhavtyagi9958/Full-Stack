package com.demo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String city= "Meerut";
	private int pincode = 201204;
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}
}
