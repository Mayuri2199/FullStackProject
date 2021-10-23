package com.placementcontroller.daoIMPL;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import com.placementcontroller.config.HibernetConfig;
import com.placementcontroller.daoInterface.CreateProfileInterface;
import com.placementcontroller.entity.DummyDocument;
import com.placementcontroller.entity.EducationalDetails;
import com.placementcontroller.entity.StudentAddress;
import com.placementcontroller.entity.StudentDocuments;
import com.placementcontroller.entity.StudentPersonalDetails;
import com.sun.nio.sctp.PeerAddressChangeNotification.AddressChangeEvent;

public class DaoCreateProfile  implements CreateProfileInterface {
	
	
	String pincode =null;
	@Override
	public String  CreateProfile(StudentPersonalDetails details){
	
	SessionFactory factory=HibernetConfig.GetHibernetObject();
		
	Session  session=factory.openSession();
	Transaction tx=session.beginTransaction();
	
	//String id= new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	//details.setID(id);
	session.save(details);
	tx.commit();
	String s="Database transation sucessfull";
	return s;
	}
	
	@Override
	public String CreateEducationProfile(EducationalDetails edu){
	
		SessionFactory factory=HibernetConfig.GetHibernetObject();
		Session  session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		session.save(edu);
		tx.commit();
		String s="Educational detatils save in database sucessfull";
		return s;
		
	}
	
	@Override
	public String CreateAddressProfile(StudentAddress address){

		SessionFactory factory=HibernetConfig.GetHibernetObject();
		Session  session=factory.openSession();
		Transaction tx=session.beginTransaction();
	     
		
		session.save(address);
		
		tx.commit();
		
		
		String s="Student Address save in database Sucessfully";
		return s;
		
	}

	@Override
	public String CreateDocumentProfile(DummyDocument doc) {
	
		StudentDocuments Studdoc=new StudentDocuments();
		byte Adhardata[]=null;
		byte PanCard[]=null;
		byte Resume[]=null;
		FileInputStream fis;
		FileInputStream fis1;
		FileInputStream fis2;
		
		
		
		System.out.println(doc.getAdharCard());
		System.out.println(doc.getPanCard());
		try {
		
			 fis=new FileInputStream(doc.getAdharCard());
			 fis1=new FileInputStream(doc.getPanCard());
			 fis2=new FileInputStream(doc.getResume());
			
			 Adhardata=new byte[fis.available()];
			 fis.read(Adhardata);
			
			 PanCard=new byte[fis1.available()];
			  fis1.read(PanCard);
			
			  Resume=new byte[fis2.available()];
			  fis2.read(Resume);
			  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		SessionFactory factory=HibernetConfig.GetHibernetObject();
		Session  session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Studdoc.setAdharid(doc.getAdharid());
		Studdoc.setAdharCard(Adhardata);
		Studdoc.setPanCard(PanCard);
		Studdoc.setResume(Resume);
		Studdoc.setAddress(doc.getAddress());
		Studdoc.setDetails(doc.getDetails());
		Studdoc.setEducationalDetails(doc.getEducationalDetails());
		session.save(Studdoc);
		
		tx.commit();
		TransactionStatus status =tx.getStatus();
		boolean sta=status.canRollback();
		String s="Documents save in database Sucessfully";
		return s;
	
	}

}
