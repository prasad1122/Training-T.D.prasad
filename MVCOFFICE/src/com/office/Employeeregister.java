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

public class Employeeregister extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		boolean status=false;
		Employeeregisterbean er=new Employeeregisterbean();
		er.setEname(ename);
		er.setPassword(password);
		er.setEmail(email);
		er.setPhone(phone);
		er.setGender(gender);
		er.setAddress(address);
		er.setDesignation(designation);
		er.setExperience(experience);
		er.setNo_of_leaves_taken(no_of_leaves_taken);
		
		try {
			status=er.register(ename, password, email, phone, gender,address, designation,experience,no_of_leaves_taken);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("./employee_login.html?msg=registered sucessfully");
		else
			response.sendRedirect("./employee_register.html?msg=register failed");
	}

}