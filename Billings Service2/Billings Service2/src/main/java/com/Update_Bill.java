package com;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

 
@WebServlet("/Update_Bill")
public class Update_Bill extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String cus_Name = request.getParameter("cus");
		String bill_Amount = request.getParameter("bia");
		String date = request.getParameter("dat");
		String email = request.getParameter("ema");
	
		
		boolean isstru;
		
		isstru=Bill_DB_Utill.Update_bill(cus_Name,bill_Amount,date,email );
			
		if(isstru == true) {
			 
			  
			  
			 
			 RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
			 dis.forward(request, response);
			
		}
		else {
			RequestDispatcher dis1 = request.getRequestDispatcher("unsucess.jsp");
			dis1.forward(request, response);
			
		}
		
		
	}

}


