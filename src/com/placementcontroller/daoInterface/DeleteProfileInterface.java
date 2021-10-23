package com.placementcontroller.daoInterface;

import com.placementcontroller.entity.EducationalDetails;
import com.placementcontroller.entity.StudentPersonalDetails;

public interface DeleteProfileInterface {
	public StudentPersonalDetails DeleteProfile(long id);
	public EducationalDetails deleteEduProfile(String stream);
	

}
