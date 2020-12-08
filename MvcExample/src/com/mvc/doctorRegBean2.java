package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class doctorRegBean2 {
	private String name,password,email, specialisation;
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
	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public boolean docregistrationValidate(String name,String password,String email,long phone, String specialisation) throws SQLException, ClassNotFoundException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("insert into doctor(name,password,email,phone,specialisation) values(?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setLong(4, phone);
		ps.setString(5,specialisation);
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}

	
}