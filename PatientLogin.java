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
public class PatientLogin extends HttpServlet{
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
	    String sql="select * from patient where email=? and password=?";
        	try {
				ps=con.prepareStatement(sql);
	        	ps.setString(1, email);
	        	ps.setString(2, password);
	        	HttpSession hs=request.getSession();
	        	  ResultSet x =ps.executeQuery();
	         // pw.println("<html><body bgcolor='wheat'><center><h1>");
			    if(x.next()) {
			    	hs.setAttribute("semail",email);
			    	//pw.println("patient login successfully");
			    //pw.println("</h1></center></body></html>");
			    	response.sendRedirect("./patient_home.html?msg=logged");
			    }
			    else
			    	//pw.println("patient login failed Invalid crediantals");
			   // pw.println("</h1></center></body></html>");
			    	response.sendRedirect("./patient_login.html?msg=failed");
			    	
        	} catch (SQLException e) {
				e.printStackTrace();
			}}}