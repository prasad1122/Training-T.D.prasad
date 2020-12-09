package com.office;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeUpdate extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ename=request.getParameter("ename");
		String number=request.getParameter("phone");
		long phone=Long.parseLong(number);
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		String designation=request.getParameter("designation");
		int experience=Integer.parseInt(request.getParameter("experience"));
		int no_of_leaves_taken=Integer.parseInt(request.getParameter("no_of_leaves_taken"));
		boolean status=false;
		try {
			status=new EmployeeUpdateBean().update( ename, phone, gender, designation, experience, no_of_leaves_taken, address);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession hs=request.getSession();
		if(status) {
			
			response.sendRedirect("./employee_profile.jsp?msg=updated sucessfully");
		}
		else
			response.sendRedirect("./update_employee_profile.html?msg=update failed");
	}

}