package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/doctorRegController2")
public class doctorRegController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		long phone=Long.parseLong(request.getParameter("phone"));
		String specialisation=request.getParameter("specialisation");
		doctorRegBean2 doc=new doctorRegBean2();
		doc.setName(name);
		doc.setPassword(password);
		doc.setEmail(email);
		doc.setPhone(phone);
		doc.setSpecialisation(specialisation);
		HttpSession hs=request.getSession();
		hs.setAttribute("prbean", doc);
		boolean status=false;
		try {
			status=doc.docregistrationValidate(name,password,email,phone,specialisation);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status){
			response.sendRedirect("./doctor_login.html");
		}
		else
			response.sendRedirect("./doctor_register.html");
	}
}