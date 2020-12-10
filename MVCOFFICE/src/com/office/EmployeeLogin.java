package com.office;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeLogin extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Employeeloginbean lb=new Employeeloginbean();
	lb.setEmail(email);
	lb.setPassword(password);
	HttpSession hs=request.getSession();
	Employeeregisterbean er=null;
		try {
			er =lb.loginValidate(email, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		if(er!=null)
		{
			hs.setAttribute("employeedetails", er);
			hs.setAttribute("id", er.getEid());
			response.sendRedirect("./employee_home.html?msg=loginsucessfull");
		}
		else
		{
			response.sendRedirect("./employee_login.html?msg=loginfailed");
		}
		
	}

}
