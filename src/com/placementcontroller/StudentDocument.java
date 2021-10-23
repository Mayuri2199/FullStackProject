package com.placementcontroller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.placementcontroller.entity.DummyDocument;
import com.placementcontroller.entity.EducationalDetails;
import com.placementcontroller.entity.StudentAddress;
import com.placementcontroller.entity.StudentPersonalDetails;
import com.placementcontroller.servicelayer.ServiceImpl;
import com.placementcontroller.servicelayer.ServiceInterface;

/**
 * Servlet implementation class StudentDocument
 */
@WebServlet("/studentdocument")
@MultipartConfig
public class StudentDocument extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentDocument() {
        super();
    }
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out=response.getWriter();
	 
	String regid=request.getParameter("id");
	String tempeid=request.getParameter("ebillid");
	Integer ebillid=Integer.parseInt(tempeid);
	String univerid=request.getParameter("eid");
	
	
	Integer uid=Integer.parseInt(univerid);
	String adhar=request.getParameter("adharid");
	
	Long adharid=Long.parseLong(adhar);
	Part part =request.getPart("adhar");
	Part part1 =request.getPart("resume");
	Part part2 =request.getPart("pancard");
	
	String adharcard=part.getSubmittedFileName();
	String resume=part1.getSubmittedFileName();
	String pancard=part2.getSubmittedFileName();
	
	
	System.out.println(adhar);
	
	String path=getServletContext().getRealPath("/"+"files"+File.separator+adharcard);
	String panpath=getServletContext().getRealPath("/"+"files"+File.separator+pancard);
	String resumepath=getServletContext().getRealPath("/"+"files"+File.separator+resume);

System.out.println(path);
System.out.println(panpath);
	InputStream is=part.getInputStream();
boolean sucss=uploadfile(is, path, panpath, resumepath);
	if(sucss){	
		
		System.out.println("file upload "+path);
	}
	else
	{
	System.out.println("file not upload");	
	}
	EducationalDetails educationalDetails=new EducationalDetails();
	educationalDetails.setEid(uid);
	StudentAddress address=new StudentAddress();
	address.setEbillId(ebillid);
	StudentPersonalDetails details=new StudentPersonalDetails();
	details.setID(regid);
	ServiceInterface serviceInterface=new ServiceImpl();
	DummyDocument doc=new DummyDocument(adharid, panpath, path, resumepath,educationalDetails, address, details);
	serviceInterface.CreateDocumentProfile(doc);


	}
	
	



public boolean uploadfile (InputStream is,String path,String panpath,String resumepath ){
	
	boolean test=false;
	try {
		byte[] byt=new byte[is.available()];
	
		is.read();
		FileOutputStream fos=new FileOutputStream(path);
		FileOutputStream fos1=new FileOutputStream(panpath);
		FileOutputStream fos2=new FileOutputStream(resumepath);
		
	fos.write(byt);
	fos.flush();
	
	fos1.write(byt);
	fos1.flush();
	
	fos2.write(byt);
	fos2.flush();
	
	fos2.close();
	test=true;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return test;
	
}
}