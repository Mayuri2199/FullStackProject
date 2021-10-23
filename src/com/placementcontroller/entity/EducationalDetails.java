package com.placementcontroller.entity;

import javax.jws.Oneway;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class EducationalDetails {
/*	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int eid;*/
	@Id
	int eid;
	@Column(length=55)
	String graduationStream;
	@Column(length=20)	 	
	double sscpercentage;
	@Column(length=20)
	double polyorhscmarks;

	@Column(length=20)
	double btechMarks;
	
	


	public EducationalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}




	public EducationalDetails(int eid, String graduationStream, double sscpercentage, double polyorhscmarks,
			double btechMarks) {
		super();
		this.eid = eid;
		this.graduationStream = graduationStream;
		this.sscpercentage = sscpercentage;
		this.polyorhscmarks = polyorhscmarks;
		this.btechMarks = btechMarks;
	}




	public int getEid() {
		return eid;
	}




	public void setEid(int eid) {
		this.eid = eid;
	}




	public String getGraduationStream() {
		return graduationStream;
	}




	public void setGraduationStream(String graduationStream) {
		this.graduationStream = graduationStream;
	}




	public double getSscpercentage() {
		return sscpercentage;
	}




	public void setSscpercentage(double sscpercentage) {
		this.sscpercentage = sscpercentage;
	}




	public double getPolyorhscmarks() {
		return polyorhscmarks;
	}




	public void setPolyorhscmarks(double polyorhscmarks) {
		this.polyorhscmarks = polyorhscmarks;
	}




	public double getBtechMarks() {
		return btechMarks;
	}




	public void setBtechMarks(double btechMarks) {
		this.btechMarks = btechMarks;
	}




	@Override
	public String toString() {
		return "EducationalDetails [eid=" + eid + ", graduationStream=" + graduationStream + ", sscpercentage="
				+ sscpercentage + ", polyorhscmarks=" + polyorhscmarks + ", btechMarks=" + btechMarks + "]";
	}



	
	
}
