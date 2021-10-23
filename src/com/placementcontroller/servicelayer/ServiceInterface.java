package com.placementcontroller.servicelayer;

import java.util.List;

import com.placementcontroller.entity.DummyDocument;
import com.placementcontroller.entity.EducationalDetails;
import com.placementcontroller.entity.StudentAddress;
import com.placementcontroller.entity.StudentDocuments;
import com.placementcontroller.entity.StudentPersonalDetails;

public interface ServiceInterface {
	public String CreateProfile(StudentPersonalDetails details);
	public String CreateEducationProfile(EducationalDetails edu);
	public String CreateAddressProfile(StudentAddress address);
	public boolean login(String UserId,String spass,String designation);
	public String CreateDocumentProfile(DummyDocument doc);
	public List<StudentDocuments> GetStudentList();



}
