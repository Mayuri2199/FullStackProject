package com.placementcontroller.entity;

import javax.persistence.Entity;

@Entity
public class DummyDocument {
	
	long adharid;
	String PanCard;
	String AdharCard;
	String Resume;
	EducationalDetails educationalDetails;
	StudentAddress address;
	StudentPersonalDetails details;
	public DummyDocument() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DummyDocument(long adharid, String panCard, String adharCard, String resume,
			EducationalDetails educationalDetails, StudentAddress address, StudentPersonalDetails details) {
		super();
		this.adharid = adharid;
		PanCard = panCard;
		AdharCard = adharCard;
		Resume = resume;
		this.educationalDetails = educationalDetails;
		this.address = address;
		this.details = details;
	}
	public long getAdharid() {
		return adharid;
	}
	public void setAdharid(long adharid) {
		this.adharid = adharid;
	}
	public String getPanCard() {
		return PanCard;
	}
	public void setPanCard(String panCard) {
		PanCard = panCard;
	}
	public String getAdharCard() {
		return AdharCard;
	}
	public void setAdharCard(String adharCard) {
		AdharCard = adharCard;
	}
	public String getResume() {
		return Resume;
	}
	public void setResume(String resume) {
		Resume = resume;
	}
	public EducationalDetails getEducationalDetails() {
		return educationalDetails;
	}
	public void setEducationalDetails(EducationalDetails educationalDetails) {
		this.educationalDetails = educationalDetails;
	}
	public StudentAddress getAddress() {
		return address;
	}
	public void setAddress(StudentAddress address) {
		this.address = address;
	}
	public StudentPersonalDetails getDetails() {
		return details;
	}
	public void setDetails(StudentPersonalDetails details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "DummyDocument [adharid=" + adharid + ", PanCard=" + PanCard + ", AdharCard=" + AdharCard + ", Resume="
				+ Resume + ", educationalDetails=" + educationalDetails + ", address=" + address + ", details="
				+ details + "]";
	}
	
	
	
}
