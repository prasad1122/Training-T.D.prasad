package com.motivity;

public class alive extends Thread
{
	public void run()
	{
		System.out.println("prasad................");
	}
	public static void main(String args[])
	{
		alive t=new alive();
		alive t1=new alive();
		System.out.println(t.getName());
		System.out.println(t1.getName());
		t.setName("Durga");
		t1.setName("Prasad");
		System.out.println(t.getName());
		System.out.println(t1.getName());
		
	}

}
