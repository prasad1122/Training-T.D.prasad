package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/patientupdatecontroller")
public class patientupdatecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		long phone=Long.parseLong(request.getParameter("phone"));
		
		
		patientupdatebean pub1=new patientupdatebean();
		pub1.setName(name);
		pub1.setPassword(password);
		pub1.setPhone(phone);
		
		HttpSession hs=request.getSession();
		hs.setAttribute("pubean", pub1);
		String email=(String)hs.getAttribute("email");
		pub1.setEmail(email);
		
		boolean status=false;
		
		try {
			status=pub1.patupdateValidate(name,password,phone);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status){
			response.sendRedirect("./patient_home.html");
		}
		else
			response.sendRedirect("./patient_profile_update.html");
	}

}