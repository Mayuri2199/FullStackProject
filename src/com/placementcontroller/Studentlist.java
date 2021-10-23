package com.placementcontroller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.xmlrpc.base.Array;
import com.placementcontroller.entity.StudentDocuments;
import com.placementcontroller.servicelayer.ServiceImpl;
import com.placementcontroller.servicelayer.ServiceInterface;


/**
 * Servlet implementation class Studentlist
 */
@WebServlet("/studentlist")
public class Studentlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Studentlist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 ServiceInterface serviceInterface=new ServiceImpl();
  List <StudentDocuments>studlist =serviceInterface.GetStudentList();
	
	
 
  
 request.setAttribute("list", studlist); 
	RequestDispatcher dispatcher=request.getRequestDispatcher("studentlist.jsp");
	dispatcher.forward(request, response);
	
	} 
	
	}


