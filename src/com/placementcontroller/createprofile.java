package com.placementcontroller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.placementcontroller.entity.StudentPersonalDetails;
import com.placementcontroller.servicelayer.ServiceImpl;
import com.placementcontroller.servicelayer.ServiceInterface;

/**
 * Servlet implementation class createprofile
 */
@WebServlet("/createprofile")
public class createprofile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createprofile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id= new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		
		HttpSession httpsession=request.getSession();
		httpsession.setAttribute("tempid", id);
		
		String FirstName=request.getParameter("first_name");
		String LastName=request.getParameter("last_name");
		String email=request.getParameter("email");
		String spass=request.getParameter("studupassword");
		String Mobile=request.getParameter("mobile");
		String UserId=request.getParameter("user_id");
		String designation=request.getParameter("Designation");

		
		
		StudentPersonalDetails details=new StudentPersonalDetails(FirstName, LastName, email, spass, Mobile, UserId, designation);
		details.setID(id);
		ServiceInterface serviceInterface=new ServiceImpl();	
			String CreateProfile=serviceInterface.CreateProfile(details);
		System.out.println(CreateProfile);
		
		
	RequestDispatcher dispatcher=request.getRequestDispatcher("Address.jsp");
	dispatcher.forward(request, response);
	
		
		}
	
	
	
	}


