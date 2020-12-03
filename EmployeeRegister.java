package com.office;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import javax.servlet.ServletConfig;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	public class EmployeeRegister extends HttpServlet {
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
			}
		}
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
			String id=request.getParameter("id");
		    String name=request.getParameter("name");
		    String salary=request.getParameter("salary");
		    String address=request.getParameter("address");
		    String jobtitle=request.getParameter("jobtitle");
		    String email=request.getParameter("email");
		    PrintWriter pw=response.getWriter();
		    String sql="insert into employee(id,name,salary,address,jobtitle,email)values(?,?,?,?,?,?)";
	        	try {
					ps=con.prepareStatement(sql);
					ps.setString(1,id);
					ps.setString(2, name);
					ps.setString(3, salary);
					ps.setString(4, address);
					ps.setString(5, jobtitle);
		        	ps.setString(6, email);
		         int  x=ps.executeUpdate();
				    if(x!=0)
				    	 response.sendRedirect("./employee_login.html?msg=registered");
	        	} catch (SQLException e) {
					e.printStackTrace();
				}
	        	}}