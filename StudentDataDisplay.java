package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class StudentDataDisplay 
{
	public static void display() throws Exception
	{
		Connection con = Database.connecitvity();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice \n 1.Retrieve All details\n 2. Retrieve sinlge row");
		int choice = sc.nextInt();
		if (choice == 1) {
			PreparedStatement ps = con.prepareStatement("select * from studentprasad");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(
						"Student [student id=" + rs.getInt(1) + ", student name=" + rs.getString(2) + ", student department =" + rs.getString(3)
								+ ", student  section =" + rs.getString(4) + ",student mobilenumber=" + rs.getInt(5) + ",student Email ="
								+ rs.getString(6) + ", enter student address =" + rs.getString(7) + ",enter student college =" + rs.getString(8) + "]");
			}
		} else if (choice == 2) {
			PreparedStatement ps = con.prepareStatement("select * from studentprasad where id=?");
			String option = "";
			do {
				System.out.println("enter id of student to be retrieve");
				int id = sc.nextInt();
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println(
							"Student [student id=" + rs.getInt(1) + ", student name=" + rs.getString(2) + ", student department =" + rs.getString(3)
							+ ", student  section =" + rs.getString(4) + ",student mobilenumber=" + rs.getInt(5) + ",student Email ="
							+ rs.getString(6) + ", enter student address =" + rs.getString(7) + ",enter student college =" + rs.getString(8) + "]");
		
				}
				System.out.println("Do you want to continue (y/n): ");
				option = sc.next();
			} while (option.equalsIgnoreCase("y"));
		}
	}	
}
