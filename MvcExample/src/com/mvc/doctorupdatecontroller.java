package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/doctorupdatecontroller")
public class doctorupdatecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		long phone=Long.parseLong(request.getParameter("phone"));
		String specialisation=request.getParameter("specialisation");
		doctorupdatebean doct=new doctorupdatebean();
		doct.setName(name);
		doct.setPassword(password);
		doct.setPhone(phone);
		doct.setSpecialisation(specialisation);
		HttpSession hs=request.getSession();
		hs.setAttribute("dubean", doct);
		String email=(String)hs.getAttribute("email");
		doct.setEmail(email);
		boolean status=false;
		try {
			status=doct.updateValidate(name,password,phone,specialisation);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status){
			response.sendRedirect("./doctor_home.html");
		}
		else
			response.sendRedirect("./doctor_profile_update.html");
	}
}