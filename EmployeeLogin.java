package com.office;
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
public class EmployeeLogin extends HttpServlet{
	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/office";
		String user="root";
		String password="Prasad@1122";
	    try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		 String id=request.getParameter("id");
		  String email=request.getParameter("email");
	    PrintWriter pw=response.getWriter();
	    String sql="select * from employee where  id=? and email=?";
        	try {
				ps=con.prepareStatement(sql);
				ps.setString(1, id);
	        	ps.setString(2, email);
	        	HttpSession hs=request.getSession();
	        	  ResultSet x =ps.executeQuery();
			    if(x.next()) {
			    	hs.setAttribute("sid",id);
			    	response.sendRedirect("./employee_home.html?msg=logged");
			    }
			    else
			    	response.sendRedirect("./employee_login.html?msg=failed");
        	} catch (SQLException e) {
				e.printStackTrace();
			}}}