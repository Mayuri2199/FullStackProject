package com.placementcontroller.servicelayer;
import java.util.List;

import com.placementcontroller.daoIMPL.DaoCreateProfile;
import com.placementcontroller.daoIMPL.DaoGetProfile;
import com.placementcontroller.daoIMPL.Login;
import com.placementcontroller.daoInterface.CreateProfileInterface;
import com.placementcontroller.daoInterface.GetProfileInterface;
import com.placementcontroller.daoInterface.LoginInterfaceDao;
import com.placementcontroller.entity.DummyDocument;
import com.placementcontroller.entity.EducationalDetails;
import com.placementcontroller.entity.StudentAddress;
import com.placementcontroller.entity.StudentDocuments;
import com.placementcontroller.entity.StudentPersonalDetails;
public class ServiceImpl implements ServiceInterface {

	CreateProfileInterface dao=new DaoCreateProfile();
	LoginInterfaceDao login=new Login();
	GetProfileInterface slist=new DaoGetProfile();
	
	@Override
	public String CreateProfile(StudentPersonalDetails details) {
		// TODO Auto-generated method stub
		return dao.CreateProfile(details);
	}
	@Override
	public String CreateEducationProfile(EducationalDetails edu) {
		// TODO Auto-generated method stub
		return dao.CreateEducationProfile(edu);
	}
	@Override
	public String CreateAddressProfile(StudentAddress address) {
		// TODO Auto-generated method stub
		return dao.CreateAddressProfile(address);
	}
	@Override
	public String CreateDocumentProfile(DummyDocument doc) {
		// TODO Auto-generated method stub
		return dao.CreateDocumentProfile(doc);
	}
	@Override
	public boolean login(String UserId, String spass, String designation) {
		// TODO Auto-generated method stub
		return login.login(UserId, spass, designation);
	}
	@Override
	public List<StudentDocuments> GetStudentList() {
		// TODO Auto-generated method stub
		return slist.GetStudentList();
	}

}
