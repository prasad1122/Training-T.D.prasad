package com.motivity;

public class Priority extends Thread {

	
		public void run()
		{
			System.out.println("Thread name:"+Thread.currentThread().getName());
			System.out.println("Thread name:"+Thread.currentThread().getPriority());
		}

	public static void main(String args[])
	{
		Priority x=new Priority();
		Priority y=new Priority();
		x.setPriority(Thread.MIN_PRIORITY);
		y.setPriority(Thread.MAX_PRIORITY);
		x.start();
		y.start();
		
	}

}
