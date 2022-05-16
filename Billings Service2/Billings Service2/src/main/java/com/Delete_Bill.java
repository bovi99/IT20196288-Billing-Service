package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 
@WebServlet("/Delete_Student")
public class Delete_Bill extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		
		
		String Acc_No=    request.getParameter("acn");
		boolean  isTrue;
	  
		isTrue=Bill_DB_Utill.deletebill(Acc_No);
			 
	
	 if(isTrue==true) {
	 
	 RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
	 dis.forward(request, response);
	 }
	 
	 else {
		 
		 RequestDispatcher dis = request.getRequestDispatcher("#");
		 dis.forward(request, response);
		 
		 
	 }
		
		
	}

}
