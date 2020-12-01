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
import javax.servlet.http.HttpSession;
public class DoctorLogin extends HttpServlet{
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
		   String email=request.getParameter("email");
	    String password=request.getParameter("password");
	    PrintWriter pw=response.getWriter();
	    String sql="select * from doctor where email=? and password=?";
        	try {
				ps=con.prepareStatement(sql);
	        	ps.setString(1, email);
	        	ps.setString(2, password);
	        	HttpSession hs=request.getSession();
	        	
			   // pw.println("<html><body bgcolor='wheat'><center><h1>");
			   ResultSet x  =ps.executeQuery();
			    if(x.next()) {
			    	hs.setAttribute("semail",email);
			    	//pw.println("Doctor login successfully");
			   // pw.println("</h1></center></body></html>");
			    	response.sendRedirect("./doctor_home.html?msg=logged in");
			    }
			    else
			    	//pw.println("Doctor logged in failed Invalid credentials");
			    //pw.println("</h1></center></body></html>");
			    	response.sendRedirect("./doctor_login.html?msg=failed");
        	} catch (SQLException e) {
				e.printStackTrace();
			}}}