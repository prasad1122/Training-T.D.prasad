package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class StudentDataDisplay {
	public static void display() throws Exception {
		Session se=Conf.config();
		Transaction tx=se.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice \n 1.Retrieve All details\n 2. Retrieve sinlge row");
		int choice = sc.nextInt();
		if (choice == 1) {
			Query qr=se.createQuery("from Student1 e");
			List<Student1> li=qr.list();
			Iterator<Student1> i=li.iterator();
			while (i.hasNext()) {
				Student1 e=i.next();
				System.out.println(
						"Student1 [eid=" + e.getId() + ", name=" + e.getName() 
								+ ", department=" + e.getDepartment() + ", section=" + e.getSection() + ", mobile="
								+ e.getMobilenumber() + ", email=" + e.getEmail() + ", address=" + e.getAddress() +",college="+e.getCollege()+ "]");
			}
		} else if (choice == 2) {
			Query qr=se.createQuery("from Student1 e where e.id=:x");
			String option = "";
			do {
				System.out.println("enter id of student to be retrieve");
				qr.setParameter("x", sc.nextInt());
				List<Student1> li=qr.list();
				Iterator<Student1> i=li.iterator();
				while (i.hasNext()) {
					Student1 e=i.next();
					System.out.println(
							"Student1 [eid=" + e.getId() + ", name=" + e.getName() 
							+ ", department=" + e.getDepartment() + ", section=" + e.getSection() + ", mobile="
							+ e.getMobilenumber() + ", email=" + e.getEmail() + ", address=" + e.getAddress() +",college="+e.getCollege()+ "]");
				}
				System.out.println("Do you want to continue (y/n): ");
				option = sc.next();
			} while (option.equalsIgnoreCase("y"));
		}
		tx.commit();
		se.close();
	}

}