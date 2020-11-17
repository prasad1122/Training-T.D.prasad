package com.motivity;

public class mythread extends Thread
{
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("i vlaue is"+i);
		}
	}
		public static void main(String args[])
		{
			mythread wt=new mythread();
		wt.start();
			for(int j=0;j<=10;j++)
			{
				System.out.println("i vlaue is"+j);
			}
			
		}
		

}
