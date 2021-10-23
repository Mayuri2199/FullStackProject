package com.placementcontroller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.placementcontroller.daoIMPL.Login;
import com.placementcontroller.daoInterface.LoginInterfaceDao;

/**
 * Servlet implementation class LoginServelet
 */
@WebServlet("/loginservelet")
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServelet() {
        super();
    }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String UserId=request.getParameter("username");
	String spass=request.getParameter("password");
	String designation=request.getParameter("Designation");
	LoginInterfaceDao login=new Login();
	
     boolean pass= login.login(UserId, spass, designation);
if(pass==true){
	switch(designation){
	case "Student":			RequestDispatcher dispatcher=request.getRequestDispatcher("StudentDashboard.jsp");
	dispatcher.forward(request, response);
    break;
	case "Admin":		RequestDispatcher dispatcher1=request.getRequestDispatcher("AdminDashboard.jsp");
	dispatcher1.forward(request, response);
    break;
	}

}

else{
	System.out.println("invalid credational");
	request.setAttribute("msg", "invalid credational");
	RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
dispatcher.forward(request, response);	
}
}



	
	
	}


