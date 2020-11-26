package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database
{
		public static Connection connecitvity() throws Exception 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/motivity";
			String username = "root";
			String password = "Prasad@1122";
			return DriverManager.getConnection(url, username, password);
		}

}

	
