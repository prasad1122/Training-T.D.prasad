package com.motivity;


	public class currentthread extends Thread
	{
		public void run()
		{
			System.out.println("prasad................"+Thread.currentThread().getName());
		}
		public static void main(String args[])
		{
			System.out.println(Thread.currentThread().getName());
			currentthread t=new currentthread();
			currentthread t1=new currentthread();
			System.out.println(t.getName());
			System.out.println(t1.getName());
			t.setName("Durga");
			t1.setName("Prasad");
			t.start();
			t1.start();
			
		}

	}


