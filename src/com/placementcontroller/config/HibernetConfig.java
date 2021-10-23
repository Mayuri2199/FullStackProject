package com.placementcontroller.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.placementcontroller.entity.EducationalDetails;
import com.placementcontroller.entity.StudentAddress;
import com.placementcontroller.entity.StudentDocuments;
import com.placementcontroller.entity.StudentPersonalDetails;

public class HibernetConfig {
	
	private static SessionFactory factoty ;
	public static SessionFactory GetHibernetObject(){
		
		factoty=new Configuration().configure().buildSessionFactory();
				 
		
		
		
		return factoty;
	
	}
	
	

}
