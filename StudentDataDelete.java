package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentDataDelete 
{

	public static void delete() throws Exception
	{
		Connection con = Database.connecitvity();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice \n 1.Delete All details\n 2. Delete sinlge row");
		int choice = sc.nextInt();
		if (choice == 1) {
			PreparedStatement ps = con.prepareStatement("delete from studentprasad");
			int a = ps.executeUpdate();
			if (a == 1)
				System.out.println("Records deleted");
		} else if (choice == 2) {
			PreparedStatement ps = con.prepareStatement("delete from studentprasad where id=?");
			String option = "";
			do {
				System.out.println("enter id of student to be deleted");
				int id = sc.nextInt();
				ps.setInt(1, id);
				int a = ps.executeUpdate();
				if (a == 1)
					System.out.println("Record Deleted");
				System.out.println("Do you want to continue (y/n): ");
				option = sc.next();
			} while (option.equalsIgnoreCase("y"));
		}
	}
}
