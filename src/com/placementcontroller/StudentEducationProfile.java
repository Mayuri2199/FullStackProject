package com.placementcontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.placementcontroller.entity.EducationalDetails;
import com.placementcontroller.entity.StudentAddress;
import com.placementcontroller.entity.StudentPersonalDetails;
import com.placementcontroller.servicelayer.ServiceImpl;
import com.placementcontroller.servicelayer.ServiceInterface;

/**
 * Servlet implementation class StudentEducationProfile
 */
@WebServlet("/studenteducationprofile")
public class StudentEducationProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentEducationProfile() {
        super();
        // TODO Auto-generated constructor stub
    }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	String tempeid=request.getParameter("eid");
    Integer eid=Integer.parseInt(tempeid);
	String graduationStream=request.getParameter("gstream");
String sscpercentage=request.getParameter("percentage");
double dssc=Double.parseDouble(sscpercentage);
String polyorhscmarks=request.getParameter("polymarks");
double dpoly=Double.parseDouble(polyorhscmarks);

String btechMarks=request.getParameter("bemarks");
double dvmarks=Double.parseDouble(btechMarks);
String tid1=request.getParameter("UniqueId");
String tpincode1=request.getParameter("pincode");

StudentAddress tpincode=new StudentAddress();
tpincode.setPincode(tpincode1);

StudentPersonalDetails tid=new StudentPersonalDetails();
tid.setID(tid1);
EducationalDetails edu=new EducationalDetails(eid,graduationStream, dssc, dpoly, dvmarks);

ServiceInterface serviceInterface=new ServiceImpl();
String StudentEdu=serviceInterface.CreateEducationProfile(edu);
if(StudentEdu=="COMMITED")
System.out.println("Educational detatils save in database Sucessfully");

}

}
