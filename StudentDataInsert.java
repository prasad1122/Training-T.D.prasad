package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentDataInsert 
{
	
	public static void insert() throws Exception 
	{
		Connection con=Database.connecitvity();
		Scanner sc=new Scanner(System.in);
		PreparedStatement ps=con.prepareStatement("insert into studentprasad values(?,?,?,?,?,?,?,?)");
		String choice="";
		do {
			 System.out.println("enter student id: ");
			    ps.setInt(1, sc.nextInt());
			    System.out.println("enter student name :");
			    ps.setString(2, sc.next());
			    System.out.println("enter  student department :");
			    ps.setString(3, sc.next());
			    System.out.println("enter student  section : ");
			    ps.setString(4, sc.next());
			    System.out.println("enter student mobilenumber : ");
			    ps.setInt(5, sc.nextInt());
			    System.out.println("enter student email ");
			    ps.setString(6, sc.next());
			    System.out.println("enter student address : ");
			    ps.setString(7, sc.next());
			    System.out.println("enter student college"
			    		+ " :");
			    ps.setString(8, sc.next());
			int a=ps.executeUpdate();
			if(a==1) {
				System.out.println("Record inserted");
			}
			System.out.println("Do you want to continue (y/n): ");
			choice=sc.next();
		}while(choice.equalsIgnoreCase("y"));
	}
}
