package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class StudentDataDelete {
	public static void delete() throws Exception {
		Session se=Conf.config();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice \n 1.Delete All details\n 2. Delete sinlge row");
		int choice = sc.nextInt();
		if (choice == 1) {
			Transaction tx=se.beginTransaction();
			Query qr=se.createQuery("delete from Student1 e");
			int a = qr.executeUpdate();
			tx.commit();
			if (a == 0)
				System.out.println("Records deleted");
		} else if (choice == 2) {
			Query qr=se.createQuery("delete from Student1 e where e.id=:y");
			String option = "";
			do {
				Transaction tx=se.beginTransaction();
				System.out.println("enter id of student to be deleted");
				qr.setParameter("y", sc.nextInt());
				int a = qr.executeUpdate();
				tx.commit();
				if (a == 1)
					System.out.println("Record Deleted");
				System.out.println("Do you want to continue (y/n): ");
				option = sc.next();
			} while (option.equalsIgnoreCase("y"));
		}
		se.close();
	}
}