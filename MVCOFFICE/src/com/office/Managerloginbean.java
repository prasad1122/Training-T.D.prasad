package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Managerloginbean {
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean loginValidate1(String email,String password) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		String sql="select * from manager where email=? and password = ?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,email);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			
			return true;
		}
		else
			return false;
	}
	
	
}