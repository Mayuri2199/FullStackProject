package com.placementcontroller.daoInterface;

import java.io.FileInputStream;

import com.placementcontroller.entity.DummyDocument;
import com.placementcontroller.entity.EducationalDetails;
import com.placementcontroller.entity.StudentAddress;
import com.placementcontroller.entity.StudentDocuments;
import com.placementcontroller.entity.StudentPersonalDetails;

public interface CreateProfileInterface {
	public String CreateProfile(StudentPersonalDetails details);
	public String CreateEducationProfile(EducationalDetails edu);
	public String CreateAddressProfile(StudentAddress address);
	public String CreateDocumentProfile(DummyDocument doc);


}
