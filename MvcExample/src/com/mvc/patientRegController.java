package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PatientRegController")
public class patientRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		long phone=Long.parseLong(request.getParameter("phone"));
		
		
		patientRegBean prb=new patientRegBean();
		prb.setName(name);
		prb.setPassword(password);
		prb.setEmail(email);
		prb.setPhone(phone);
		
		HttpSession hs=request.getSession();
		hs.setAttribute("prbean", prb);
		boolean status=false;
		
		try {
			status=prb.registrationValidate(name,password,email,phone);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status){
			response.sendRedirect("./patient_login.html");
		}
		else
			response.sendRedirect("./patient_register.html");
	}
}