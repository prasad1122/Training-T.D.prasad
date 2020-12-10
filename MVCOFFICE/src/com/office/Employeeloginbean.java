package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

public class Employeeloginbean {
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
	public Employeeregisterbean loginValidate(String email,String password) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		
		String sql="select * from employee where email=? and password =?";
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setString(1,email);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		Employeeregisterbean er=new Employeeregisterbean();
		if(rs.next()) {
			er.setEid(rs.getInt("eid"));
			er.setEname(rs.getString("ename"));
			er.setPassword(rs.getString("password"));
			er.setEmail(rs.getString("email"));
			er.setPhone(rs.getLong("phone"));
			er.setGender(rs.getString("gender"));
			er.setAddress(rs.getString("address"));
			er.setDesignation(rs.getString("designation"));
			er.setExperience(rs.getInt("experience"));
			er.setNo_of_leaves_taken(rs.getInt("no_of_leaves_taken"));
			
			
			
		}
		return er;
	}
	
	
}