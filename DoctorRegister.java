package com.motivity;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DoctorRegister extends HttpServlet{
	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/Apollo";
		String user="root";
		String password="Prasad@1122";
	    try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
	    String name=request.getParameter("name");
	    String password=request.getParameter("password");
	    String email=request.getParameter("email");
	    String phone=request.getParameter("phone");
	    	  long mobile=Long.parseLong(phone);
	    String specialisation=request.getParameter("specialisation");
	    PrintWriter pw=response.getWriter();
	    String sql="insert into doctor(name,password,email,phone,specialisation)values(?,?,?,?,?)";
        	try {
				ps=con.prepareStatement(sql);
				ps.setString(1, name);
	        	ps.setString(2, password);
	        	ps.setString(3, email);
	        	ps.setString(4, phone);
	        	ps.setString(5, specialisation);
	        	pw.println("<html><body bgcolor='wheat'><center><h1>");
			   int  x=ps.executeUpdate();
			    if(x!=0 )
			    	//pw.println("Doctor Registered successfully");
			   // pw.println("</h1></center></body></html>");
			   response.sendRedirect("./doctor_login.html?msg=registered");
        	} catch (SQLException e) {
				e.printStackTrace();
			}}}