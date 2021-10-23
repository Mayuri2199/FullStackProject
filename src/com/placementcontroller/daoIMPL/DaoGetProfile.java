package com.placementcontroller.daoIMPL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.placementcontroller.config.HibernetConfig;
import com.placementcontroller.daoInterface.GetProfileInterface;
import com.placementcontroller.entity.StudentDocuments;
import com.placementcontroller.entity.StudentPersonalDetails;

public class DaoGetProfile implements GetProfileInterface {
	
	
	public StudentPersonalDetails GetSingleStudentDetails(long id){

		SessionFactory factory=HibernetConfig.GetHibernetObject();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		StudentPersonalDetails details=session.get(StudentPersonalDetails.class, id);
		
		return details;
	}
	
	public List<StudentDocuments> GetStudentList(){
		
		SessionFactory factory=HibernetConfig.GetHibernetObject();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
			
			List<StudentDocuments> studoc=session.createCriteria(
			StudentDocuments.class)
			.list();
			
			return studoc;
	
	}

}
