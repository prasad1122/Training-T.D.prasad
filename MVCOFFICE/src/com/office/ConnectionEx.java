package com.office;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionEx 
{
	public static Connection Connectivity() throws ClassNotFoundException,SQLException
	{
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/office";
	String user="root";
	String password="Prasad@1122";
	 Connection con=DriverManager.getConnection(url, user, password);
return con;
}
}