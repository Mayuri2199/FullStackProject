package com.placementcontroller.entity;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class StudentPersonalDetails {
	@Id
	String ID;
	
	@Column(length=100)
	String FirstName;

	@Column(length=100)
	String LastName;

	@Column(length=100)
	String email;

	@Column(length=45)
	String spass;

	@Column(length=40)
	String Mobile;

	@Column(length=40)
	String UserId;

	String designation;

	public StudentPersonalDetails( String firstName, String lastName, String email, String spass,
			String mobile, String userId, String designation) {
		super();
	
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.spass = spass;
		Mobile = mobile;
		UserId = userId;
		this.designation = designation;
	}

	public StudentPersonalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSpass() {
		return spass;
	}

	public void setSpass(String spass) {
		this.spass = spass;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "StudentPersonalDetails [ID=" + ID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", email="
				+ email + ", spass=" + spass + ", Mobile=" + Mobile + ", UserId=" + UserId + ", designation="
				+ designation + "]";
	}

}
