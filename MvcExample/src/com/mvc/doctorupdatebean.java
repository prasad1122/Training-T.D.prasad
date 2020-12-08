package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class doctorupdatebean {
	private String name,password,specialisation,email;
	Long phone;
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

	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public boolean updateValidate(String name,String password,long phone,String specialisation) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("update doctor set name=?,set password=?,phone=?,specialisation=? where email=?");
		ps.setString(1, name);
		ps.setString(2, password);
		ps.setString(3, getEmail());
		ps.setLong(4, phone);
		ps.setString(5, specialisation);
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}
}
