package com.placementcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.placementcontroller.entity.StudentAddress;
import com.placementcontroller.servicelayer.ServiceImpl;
import com.placementcontroller.servicelayer.ServiceInterface;
@WebServlet("/studentaddressdetails")
public class StudentAddressDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public StudentAddressDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String billid=request.getParameter("ebillid");
	    Integer myebillid=Integer.parseInt(billid); 
		String mycountry=request.getParameter("country");
	    String mypincode=request.getParameter("pincode");
	    String mycity=request.getParameter("city");
	
	HttpSession addresssession=request.getSession();
	addresssession.setAttribute("tpincode", mypincode);
	
	
	StudentAddress address=new StudentAddress(myebillid,mycountry, mypincode, mycity);
	
	
	ServiceInterface serviceInterface=new ServiceImpl();
	String AddressDetails=serviceInterface.CreateAddressProfile(address);
	System.out.println(AddressDetails);
	
	RequestDispatcher dispatcher=request.getRequestDispatcher("Educational.jsp");
	dispatcher.forward(request, response);

	
	
	
	}
	
	
	

}
