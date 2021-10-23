package com.placementcontroller.daoIMPL;

import java.util.List;

import javax.servlet.Registration;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.placementcontroller.config.HibernetConfig;
import com.placementcontroller.daoInterface.LoginInterfaceDao;
import com.placementcontroller.entity.StudentPersonalDetails;


public class Login implements LoginInterfaceDao {
	
		SessionFactory factory=null;
		
		{
			factory=HibernetConfig.GetHibernetObject();
				
		}
		Session session=null;
		Transaction transaction=null;
	@Override
	public boolean login(String UserId, String spass, String designation) {
		 session=factory.openSession();
		transaction=session.beginTransaction();
		System.out.println(UserId);
		System.out.println(spass);
		Criteria criteria=session.createCriteria(StudentPersonalDetails.class);
		Criterion cr1=Restrictions.eq("UserId", UserId);
		Criterion cr2= Restrictions.eqOrIsNull("spass", spass);
		Criterion result=Restrictions.and(cr1, cr2);
		
		List< StudentPersonalDetails> list=criteria.add(result).list();
		if(!list.isEmpty()){
			
			return true;
						
		}
		else
	return false;
		
	/*	if(!list.isEmpty()){
			System.out.println("login sucessfully");
	
			return true;
			
		}
		else{
			System.out.println("invalid credational");
			return false;
			
		}
	*/}
	

}
