package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController2 extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		LoginBean2 plb=new LoginBean2();
	plb.setEmail(email);
	plb.setPassword(password);
		HttpSession hs=request.getSession();
		hs.setAttribute("bean1", plb);
		boolean status=false;
		try {
			status =plb.loginValidate(email, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		if(status)
		{
			response.sendRedirect("./patient_home.html");
		}
		else
		{
			response.sendRedirect("./patient_login.html");
		}
		
	}

}
