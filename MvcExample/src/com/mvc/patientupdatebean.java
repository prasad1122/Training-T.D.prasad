package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class patientupdatebean {
	private String name,password,email;
	private long phone;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public boolean patupdateValidate(String name,String password,Long phone) throws SQLException, ClassNotFoundException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("update patient set name=?,password=?,phone=?, where email=?");
		ps.setString(1, name);
		ps.setString(2, password);
		ps.setString(3, getEmail());
		ps.setLong(4, phone);
		
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}


}