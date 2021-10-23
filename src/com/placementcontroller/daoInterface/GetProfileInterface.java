package com.placementcontroller.daoInterface;

import java.util.List;

import com.placementcontroller.entity.StudentDocuments;
import com.placementcontroller.entity.StudentPersonalDetails;

public interface GetProfileInterface {
	public StudentPersonalDetails GetSingleStudentDetails(long id);
	public List<StudentDocuments> GetStudentList();
}
