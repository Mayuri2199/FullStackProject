package com.placementcontroller.entity;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class StudentDocuments {
	
	@Id
	long adharid;
	@Lob
	byte PanCard[];
    
	@Lob
	@Column(length=100000)
	byte AdharCard[];
	
	@Lob
	byte Resume[];
   
	@OneToOne(fetch=FetchType.EAGER)
   @JoinColumn(name="Registerid")
	StudentPersonalDetails details;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="Ebill")
	StudentAddress address;

     @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EID")
	EducationalDetails educationalDetails;
	
     public StudentDocuments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDocuments(long adharid, byte[] panCard, byte[] adharCard, byte[] resume,
			StudentPersonalDetails details, StudentAddress address, EducationalDetails educationalDetails) {
		super();
		this.adharid = adharid;
		PanCard = panCard;
		AdharCard = adharCard;
		Resume = resume;
		this.details = details;
		this.address = address;
		this.educationalDetails = educationalDetails;
	}

	public long getAdharid() {
		return adharid;
	}

	public void setAdharid(long adharid) {
		this.adharid = adharid;
	}

	public byte[] getPanCard() {
		return PanCard;
	}

	public void setPanCard(byte[] panCard) {
		PanCard = panCard;
	}

	public byte[] getAdharCard() {
		return AdharCard;
	}

	public void setAdharCard(byte[] adharCard) {
		AdharCard = adharCard;
	}

	public byte[] getResume() {
		return Resume;
	}

	public void setResume(byte[] resume) {
		Resume = resume;
	}

	public StudentPersonalDetails getDetails() {
		return details;
	}

	public void setDetails(StudentPersonalDetails details) {
		this.details = details;
	}

	public StudentAddress getAddress() {
		return address;
	}

	public void setAddress(StudentAddress address) {
		this.address = address;
	}

	public EducationalDetails getEducationalDetails() {
		return educationalDetails;
	}

	public void setEducationalDetails(EducationalDetails educationalDetails) {
		this.educationalDetails = educationalDetails;
	}

	@Override
	public String toString() {
		return "StudentDocuments [adharid=" + adharid + ", PanCard=" + Arrays.toString(PanCard) + ", AdharCard="
				+ Arrays.toString(AdharCard) + ", Resume=" + Arrays.toString(Resume) + ", details=" + details
				+ ", address=" + address + ", educationalDetails=" + educationalDetails + "]";
	}
	
	

	

}
