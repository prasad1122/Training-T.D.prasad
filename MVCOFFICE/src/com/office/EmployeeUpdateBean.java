package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeUpdateBean {
	private int eid;
	private String ename;
	private String password;
	private String email;
	private long phone;
	private String gender;
	private String designation;
	private int experience;
	private int no_of_leaves_taken;
	private String address;
	public int getEId() {
		return eid;
	}
	public void setEId(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getNo_of_leaves_taken() {
		return no_of_leaves_taken;
	}
	public void setNo_of_leaves_taken(int no_of_leaves_taken) {
		this.no_of_leaves_taken = no_of_leaves_taken;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employeeregisterbean update(String ename, String password,String email, long phone, String gender,String address,
			String designation, int no_of_leaves_taken,int eid) throws ClassNotFoundException, SQLException{
		Connection con=ConnectionEx.Connectivity();		
		String sql="update employee set ename=?,email=?,phone=?,gender=?,address=?,designation=?,experience=?,no_of_leaves_taken=? where eid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,ename);
		ps.setString(2, password);
		ps.setString(3,email);
		ps.setLong(4, phone);
		ps.setString(5,gender);
		ps.setString(6,designation);
		ps.setInt(7,no_of_leaves_taken);
		ps.setInt(8, eid);
		int x=ps.executeUpdate();
		if(x!=0) {
			ps=con.prepareStatement("select * from employee where eid=?");
			ps.setInt(1, eid);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
			Employeeregisterbean erb=new Employeeregisterbean();
			erb.setEid(eid);
			erb.setEname(ename);
			erb.setEmail(email);
			erb.setPassword(password);
			erb.setPhone(phone);
			erb.setGender(gender);
			erb.setDesignation(designation);
			erb.setNo_of_leaves_taken(no_of_leaves_taken);
			return erb;
		}
		else
			return null;
		
	}
		return null;
	}
}
