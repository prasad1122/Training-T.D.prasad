package com.office;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Managerlogin extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Managerloginbean mb=new Managerloginbean();
	mb.setEmail(email);
	mb.setPassword(password);
		HttpSession hs=request.getSession();
		hs.setAttribute("bean1", mb);
		boolean status=false;
		try {
			status =mb.loginValidate1(email, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		if(status)
		{
			response.sendRedirect("./manager_home.html");
		}
		else
		{
			response.sendRedirect("./manager_login.html");
		}
		
	}

}
