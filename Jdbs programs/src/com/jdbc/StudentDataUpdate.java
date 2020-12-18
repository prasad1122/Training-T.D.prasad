package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StudentDataUpdate {
	public static void update() throws Exception {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Scanner sc = new Scanner(System.in);
		int choice = 0,a = 0;
		String option = "";
		do {
			Transaction tx=se.beginTransaction();
			System.out.println(
					"Select your option\n 1. update name \n 2. update department \n 3. update section \n 4. update mobile \n 5. update email \n 6. update address \n 7.update college");
			choice=sc.nextInt();
			if (choice == 1) {
				Query qr=se.createQuery("update Student1 e set e.name=:x where e.id=:y");
				System.out.println("Enter new name:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which name to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 2) {
				Query qr=se.createQuery("update Student1 e set e.department=:x where e.id=:y");
				System.out.println("Enter new department :");
				qr.setParameter("x", sc.nextInt());
				System.out.println("enter the id to which department to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 3) {
				Query qr=se.createQuery("update Student1 e set e.section=:x where e.id=:y");
				System.out.println("Enter new section:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which section to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 4) {
				Query qr=se.createQuery("update Student1 e set e.mobile=:x where e.id=:y");
				System.out.println("Enter new mobile:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which mobile to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 5) {
				Query qr=se.createQuery("update Student1 e set e.email=:x where e.id=:y");
				System.out.println("Enter new email:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which email to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 6) {
				Query qr=se.createQuery("update Student1 e set e.address=:x where e.id=:y");
				System.out.println("Enter new address:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which address to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 6) {
				Query qr=se.createQuery("update Student1 e set e.college=:x where e.id=:y");
				System.out.println("Enter new college:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which college to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			}
			tx.commit();
			System.out.println("Do you want to continue (y/n)");
			option = sc.next();
		} while (option.equalsIgnoreCase("y"));
		se.close();
	}
}