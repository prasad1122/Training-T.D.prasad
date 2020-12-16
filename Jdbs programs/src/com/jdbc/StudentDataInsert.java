package com.jdbc;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDataInsert {
	
	public static void insert() throws Exception {
		Session se=Conf.config();
		Scanner sc=new Scanner(System.in);
		String choice="";
		do {
			Transaction tx=se.beginTransaction();
			Student1 e=new Student1();
			 System.out.println("enter student id: ");
			   e.setId(sc.nextInt());
			    System.out.println("enter student name :");
			    e.setName(sc.next());
			    System.out.println("enter student department : ");
			    e.setDepartment(sc.next());
			    System.out.println("enter student section :");
			    e.setSection(sc.next());
			    System.out.println("enter student mobilenumber : ");
			    e.setMobilenumber(sc.nextInt());
			    System.out.println("enter student email: ");
			    e.setEmail(sc.next());
			    System.out.println("enter student address: ");
			    e.setAddress(sc.next());
			    System.out.println("enter student college :");
			    e.setCollege( sc.next());
			    Serializable s=se.save(e);
			tx.commit();
			if(s.hashCode()>0) {
				System.out.println("Record inserted");
			}
			System.out.println("Do you want to continue (y/n): ");
			choice=sc.next();
		}while(choice.equalsIgnoreCase("y"));
		se.close();
	}
}