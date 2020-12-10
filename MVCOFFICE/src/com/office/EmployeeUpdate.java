package com.office;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeUpdate extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		int eid=Integer.parseInt(request.getParameter("emp_id"));				
		String ename=request.getParameter("ename");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String number=request.getParameter("phone");
		long phone=Long.parseLong(number);
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		String designation=request.getParameter("designation");
		int experience=Integer.parseInt(request.getParameter("experience"));
		int no_of_leaves_taken=Integer.parseInt(request.getParameter("no_of_leaves_taken"));
		
		EmployeeUpdateBean eu=new EmployeeUpdateBean();
		eu.setEname(ename);
		eu.setPassword(password);
		eu.setEmail(email);
		eu.setPhone(phone);
		eu.setGender(gender);
		eu.setAddress(address);
		eu.setDesignation(designation);
		eu.setExperience(experience);
		eu.setNo_of_leaves_taken(no_of_leaves_taken);
		HttpSession hs=request.getSession();
		Employeeregisterbean er=null;
		
		try {
			er=eu.update(ename, password, email, phone, gender, address, designation, no_of_leaves_taken, eid);
					} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		if(er!=null)
		{
			hs.setAttribute("EmployeeDetails", er);
			response.sendRedirect("./employee_profile.jsp?msg=Profile updated");
		}
		else
			response.sendRedirect("./update_employee_profile.jsp?msg=update failed");		
	}
}