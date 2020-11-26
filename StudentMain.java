package com.jdbc;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("Select your option\n 1. Insert\n 2. Display\n 3. Update\n 4. Delete\n 5. Exit");
			choice=sc.nextInt();
				if(choice == 1) 
				{
					StudentDataInsert.insert();
				}
				else if(choice == 2)
				{
					StudentDataDisplay.display();
				}
				else if(choice == 3)
				{
					StudentDataUpdate.update();
				}
				else if(choice == 4)
				{
					StudentDataDelete.delete();
				}
				
				else if(choice==5)
				{
					System.exit(0);
				}			
		}while(choice!=5);
	}
}
