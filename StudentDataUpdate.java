package com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class StudentDataUpdate
{
	public static void update() throws Exception
	{
		Connection con = Database.connecitvity();
		Scanner sc = new Scanner(System.in);
		int choice = 0,a = 0;
		PreparedStatement ps = null;
		String option = "";
		do {
			System.out.println(
					"Select your option\n 1. update id \n 2. update name \n 3. update department"
					+ " \n 4. update section \n 5. update mobilenumber \n 6. update email \n 7. update address \n 8.update college");
			choice=sc.nextInt();
			if (choice == 1) {
				ps = con.prepareStatement("update studentprasad set id=? where id=?");
				System.out.println("Enter new id:");
				ps.setString(1, sc.next());
				System.out.println("enter the id to which id to be updated: ");
				ps.setInt(2, sc.nextInt());
				a = ps.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 2) {
				ps = con.prepareStatement("update studentprasad set name=? where id=?");
				System.out.println("Enter new name:");
				ps.setString(1, sc.next());
				System.out.println("enter the id to which name to be updated: ");
				ps.setInt(2, sc.nextInt());
				a = ps.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 3) {
				ps = con.prepareStatement("update studentprasad set department=? where id=?");
				System.out.println("Enter new department:");
				ps.setString(1, sc.next());
				System.out.println("enter the id to which department to be updated: ");
				ps.setInt(2, sc.nextInt());
				a = ps.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 4) {
				ps = con.prepareStatement("update studentprasad set section=? where id=?");
				System.out.println("Enter new section:");
				ps.setString(1, sc.next());
				System.out.println("enter the id to which section to be updated: ");
				ps.setInt(2, sc.nextInt());
				a = ps.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 5) {
				ps = con.prepareStatement("update studentprasad set mobilenumber=? where id=?");
				System.out.println("Enter new number:");
				ps.setString(1, sc.next());
				System.out.println("enter the id to which number to be updated: ");
				ps.setInt(2, sc.nextInt());
				a = ps.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 6) {
				ps = con.prepareStatement("update studentprasad set email=? where id=?");
				System.out.println("Enter new email:");
				ps.setString(1, sc.next());
				System.out.println("enter the id to which email to be updated: ");
				ps.setInt(2, sc.nextInt());
				a = ps.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 7) {
				ps = con.prepareStatement("update studentprasad set address=? where id=?");
				System.out.println("Enter new address:");
				ps.setString(1, sc.next());
				System.out.println("enter the id to address to be updated: ");
				ps.setInt(2, sc.nextInt());
				a = ps.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 8) {
				ps = con.prepareStatement("update studentprasad set college=? where id=?");
				System.out.println("Enter new college:");
				ps.setString(1, sc.next());
				System.out.println("enter the id to college to be updated: ");
				ps.setInt(2, sc.nextInt());
				a = ps.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			}
			System.out.println("Do you want to continue (y/n)");
			option = sc.next();
		} while (option.equalsIgnoreCase("y"));		
	}	
}
