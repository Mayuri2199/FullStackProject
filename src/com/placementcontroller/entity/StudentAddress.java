package com.placementcontroller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentAddress {
	@Id
	int EbillId;
	String pincode;
	String country;
	String city;
	
	
	public StudentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentAddress(int ebillId, String pincode, String country, String city) {
		super();
		EbillId = ebillId;
		this.pincode = pincode;
		this.country = country;
		this.city = city;
	}


	public int getEbillId() {
		return EbillId;
	}


	public void setEbillId(int ebillId) {
		EbillId = ebillId;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "StudentAddress [EbillId=" + EbillId + ", pincode=" + pincode + ", country=" + country + ", city=" + city
				+ "]";
	}
		
	
}
