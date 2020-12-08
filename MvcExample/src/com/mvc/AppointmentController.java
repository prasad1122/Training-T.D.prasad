package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AppointmentController")
public class AppointmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		long phone=Long.parseLong(request.getParameter("phone"));
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String blood_group=request.getParameter("blood_group");
		String specialist=request.getParameter("specialist");
		String date_of_appointment=request.getParameter("date_of_appointment");
		String time_of_appointment=request.getParameter("time_of_appointment");

		AppointmentBean ab=new AppointmentBean();
		ab.setPatient_name(name);
		ab.setPhone(phone);
		ab.setEmail(email);
		ab.setGender(gender);
		ab.setBlood_group(blood_group);
		ab.setSpecialist(specialist);
		ab.setDate_of_appointment(date_of_appointment);
		ab.setTime_of_appointment(time_of_appointment);
		
		HttpSession hs=request.getSession();
		hs.setAttribute("abbean", ab);
		boolean status=false;
		
		try {
			status=ab.registrationValidate(name, phone, email, gender, blood_group, specialist, date_of_appointment, time_of_appointment);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(status) {
			response.sendRedirect("./patient_home.html");
		}
		else
			response.sendRedirect("./appointment.html");
	}

}