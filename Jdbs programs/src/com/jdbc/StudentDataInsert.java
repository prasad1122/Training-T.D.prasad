package com.jdbc;


import java.util.Scanner;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDataInsert {
	
	public static void insert() throws Exception {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
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
			    Object s=se.save(e);
			tx.commit();
			if(s!=null) {
				System.out.println("Record inserted");
			}
			System.out.println("Do you want to continue (y/n): ");
			choice=sc.next();
		}while(choice.equalsIgnoreCase("y"));
		se.close();
	}
}