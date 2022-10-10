package com.technoelevate.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PermanentAddress implements Address {
	@Value("Nagawade wadi")
	private String landmark;
	private String city;
	private int pincode;
	private String housenm;

//	public PermanentAddress(String landmark, String city, int pincode, String housenm) {
//		super();
//		this.landmark = landmark;
//		this.city = city;
//		this.pincode = pincode;
//		this.housenm = housenm;
//	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getHousenm() {
		return housenm;
	}

	public void setHousenm(String housenm) {
		this.housenm = housenm;
	}

	@Override
	public Address getAddress() {
		return null;
	}

	@Override
	public String toString() {
		return "PermanentAddress [landmark=" + landmark + ", city=" + city + ", pincode=" + pincode + ", housenm="
				+ housenm + "]";
	}

	public Address getPermanentAddress() {
		
		return null;
		
		

	}

}
