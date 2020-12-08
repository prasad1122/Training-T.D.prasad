package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class patientRegBean {
	private String name,password,email;
	long phone;
	
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

	public boolean registrationValidate(String name,String password,String email,long phone) throws SQLException, ClassNotFoundException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("insert into patient(name,password,email,phone) values(?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setLong(4, phone);
		
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}
}